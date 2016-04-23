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
package edu.kit.ipd.sdq.mediastore.ejb.mediamanagement;

import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.Stateless;
import javax.naming.NamingException;

import edu.kit.ipd.sdq.mediastore.basic.config.JNDIPool;
import edu.kit.ipd.sdq.mediastore.basic.data.AudioFile;
import edu.kit.ipd.sdq.mediastore.basic.data.AudioFileInfo;
import edu.kit.ipd.sdq.mediastore.basic.exceptions.FailedDownloadException;
import edu.kit.ipd.sdq.mediastore.basic.exceptions.FailedUploadException;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.IDownload;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.IMediaAccess;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.IMediaManagement;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.IPackaging;
import edu.kit.ipd.sdq.mediastore.basic.utils.JNDIUtil;

/**
 * @author Anastasia
 */
@Stateless
public class MediaManagementImpl implements IMediaManagement {

    private static final long serialVersionUID = -8294016625795719929L;

    IDownload nextInDowloadChain;
    IMediaAccess mediaAdapter;
    IPackaging packaging;

//	public MediaManagerImpl() {
//		System.out.println("MediaManagerImpl.MediaManagerImpl()");
//	}

    private void initMediaAdapter() {
        if (this.mediaAdapter == null) {
            try {
                this.mediaAdapter = (IMediaAccess) JNDIUtil.find(JNDIPool.MEDIA_ACCESS);
            } catch (final NamingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    private void initNext() {
        if (this.nextInDowloadChain == null) {
            try {
//				nextInDowloadChain = (IDownload) JNDIUtil.find(JNDIPool.MEDIA_ACCESS_DOWNLOAD);
                this.nextInDowloadChain = (IDownload) JNDIUtil.find(JNDIPool.TAG_WATERMARKING);
//				nextInDowloadChain = (IDownload) JNDIUtil.find(JNDIPool.AUDIO_WATERMARKING);
//				nextInDowloadChain = (IDownload) JNDIUtil.find(JNDIPool.REENCODER);
//				nextInDowloadChain = (IDownload) JNDIUtil.find(JNDIPool.CACHE);
            } catch (final NamingException e) {
                e.printStackTrace();
            }
        }
    }

    private void initPackaging() {
        if (this.packaging == null) {
            try {
                this.packaging = (IPackaging) JNDIUtil.find(JNDIPool.PACKAGING);
            } catch (final NamingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Override
    public Long upload(final AudioFile file) throws FailedUploadException, NamingException, RemoteException {
        this.initMediaAdapter();
        return this.mediaAdapter.upload(file);
    }

    @Override
    public List<AudioFileInfo> getFileList() throws NamingException {
        this.initMediaAdapter();
        return this.mediaAdapter.getFileList();
    }

    @Override
    public byte[] download(final List<Long> requestedAudioIDs, final List<Integer> bitrates,
            final String downloaderLogin) throws FailedDownloadException, NamingException {

        if (requestedAudioIDs.size() != bitrates.size()) {
            throw new RuntimeException("Number of requested audios (" + requestedAudioIDs.size()
                    + ") does not equal number of bitrates (" + bitrates.size() + ')');
        }

//        System.out.println("MediaManagerImpl.download()" + requestedAudioIDs);

        this.initNext();
        final List<AudioFile> audioFiles = this.nextInDowloadChain.download(requestedAudioIDs, bitrates,
                downloaderLogin);
//        System.out.println("MediaManagerImpl. AudioFile count:" + audioFiles.size());

        byte[] file;
        if (audioFiles.size() == 1) {
            file = audioFiles.get(0).getBytes();
        } else {
            this.initPackaging();
            file = this.packaging.zip(audioFiles);
        }

        return file;
    }

}
