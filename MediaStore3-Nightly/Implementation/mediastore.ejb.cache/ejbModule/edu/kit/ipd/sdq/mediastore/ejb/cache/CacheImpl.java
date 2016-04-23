/**
 * Media Store V3
 * Copyright (C) 2015 Software Design and Quality Group (SDQ), KIT, Germany
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.kit.ipd.sdq.mediastore.ejb.cache;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.naming.NamingException;

import edu.kit.ipd.sdq.mediastore.basic.config.JNDIPool;
import edu.kit.ipd.sdq.mediastore.basic.data.AudioFile;
import edu.kit.ipd.sdq.mediastore.basic.exceptions.FailedDownloadException;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.ICacheMaintenance;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.IDownload;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.IDownloadCache;
import edu.kit.ipd.sdq.mediastore.basic.utils.JNDIUtil;

/**
 * This bean operates as a wrapper for a singleton to allow non-blocking fetching of data.
 */
@Stateless
public class CacheImpl implements IDownloadCache, ICacheMaintenance {

    private IDownload next;

    @EJB
    private CacheSingleton cache;

    @PostConstruct
    public void init() {
        try {
            this.next = (IDownload) JNDIUtil.find(JNDIPool.REENCODER);
//			next = (IDownload) JNDIUtil.find(JNDIPool.MEDIA_ACCESS_DOWNLOAD);
        } catch (final NamingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<AudioFile> download(final List<Long> requestedAudioIDs, final List<Integer> bitrates,
            final String downloaderLogin) throws FailedDownloadException, NamingException {

//		System.out.println("download via cache");

        final List<Long> unCachedAudioIDs = new ArrayList<Long>();
        final List<Integer> unCachedBitrates = new ArrayList<Integer>();
        final List<AudioFile> result = new ArrayList<AudioFile>();

        // search for cached audios
        for (int i = 0; i < requestedAudioIDs.size(); i++) {
            final long id = requestedAudioIDs.get(i);
            final int bitrate = bitrates.get(i);
            final AudioFile cachedAudio = this.cache.getIfPresent(new IdAndBitrate(id, bitrate));
            if (cachedAudio == null) {
                // audio not cached
                unCachedAudioIDs.add(id);
                unCachedBitrates.add(bitrate);
            } else {
                // audio cached
                result.add(cachedAudio);
            }
        }

        // get remaining audios
        if (unCachedAudioIDs.size() > 0) {
            final List<AudioFile> unCachedAudios = this.next.download(unCachedAudioIDs, unCachedBitrates,
                    downloaderLogin);

            // add remaining audios to cache and result list
            for (int i = 0; i < unCachedAudioIDs.size(); i++) {
                final long id = unCachedAudioIDs.get(i);
                final int bitrate = unCachedBitrates.get(i);
                final AudioFile unCachedAudio = unCachedAudios.get(i);

                this.cache.put(new IdAndBitrate(id, bitrate), unCachedAudio);
                result.add(unCachedAudio);
            }
        }

        return result;
    }

    @Override
    public void clear() {
        this.cache.clear();
    }
}
