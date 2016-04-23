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
package edu.kit.ipd.sdq.mediastore.ejb.tagwatermarking;

import java.io.File;
import java.util.List;
import java.util.ListIterator;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.naming.NamingException;

import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

import edu.kit.ipd.sdq.mediastore.basic.config.JNDIPool;
import edu.kit.ipd.sdq.mediastore.basic.data.AudioFile;
import edu.kit.ipd.sdq.mediastore.basic.exceptions.FailedDownloadException;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.IDownload;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.IDownloadTagWatermarking;
import edu.kit.ipd.sdq.mediastore.basic.utils.FSUtil;
import edu.kit.ipd.sdq.mediastore.basic.utils.JNDIUtil;

/**
 * Session Bean implementation class TagwatermarkingImpl
 */
@Stateless
public class TagWatermarkingImpl implements IDownloadTagWatermarking {

    private IDownload next;

    /**
     * Default constructor.
     */
    public TagWatermarkingImpl() {
    }

    @PostConstruct
    public void init() {
        try {
//			next = (IDownload) JNDIUtil.find(JNDIPool.CACHE);
            this.next = (IDownload) JNDIUtil.find(JNDIPool.REENCODER);
            // next = (IDownload) JNDIUtil.find(JNDIPool.AUDIO_WATERMARKING);
            // next = (IDownload) JNDIUtil.find(JNDIPool.MEDIA_ACCESS_DOWNLOAD);
        } catch (final NamingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<AudioFile> download(final List<Long> requestedAudioIDs, final List<Integer> bitrates,
            final String downloaderLogin) throws FailedDownloadException, NamingException {

        final List<AudioFile> fileList = this.next.download(requestedAudioIDs, bitrates, downloaderLogin);

        int j = 0;
        for (final ListIterator<AudioFile> i = fileList.listIterator(); i.hasNext();) {

            this.watermark(downloaderLogin, fileList, j, i);

            j++;
        }

        return fileList;
    }

    private void watermark(final String downloaderLogin, final List<AudioFile> fileList, final int j,
            final ListIterator<AudioFile> i) {
        final String tempFileName = FSUtil.getTempFileName(downloaderLogin, "mp3");
        final File file = new File(tempFileName);

        try {
            FSUtil.writeToFile(i.next().getBytes(), file.getAbsolutePath());
            final MP3File mp3file = (MP3File) AudioFileIO.read(file);
            final Tag tag = mp3file.getTagOrCreateAndSetDefault();
            tag.setField(FieldKey.COMMENT, downloaderLogin + " has downloaded this file from Mediastore");
            mp3file.commit();
            final byte[] bytes = FSUtil.consumeFileToMem(tempFileName);
            fileList.get(j).setBytes(bytes);
        } catch (final Exception e) {
            // TODO proper exc handling
            e.printStackTrace();
        }
    }

}
