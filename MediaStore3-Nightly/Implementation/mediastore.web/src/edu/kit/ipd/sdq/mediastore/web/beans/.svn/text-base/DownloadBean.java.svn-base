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
package edu.kit.ipd.sdq.mediastore.web.beans;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.naming.NamingException;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import edu.kit.ipd.sdq.mediastore.basic.config.JNDIPool;
import edu.kit.ipd.sdq.mediastore.basic.data.AudioFileInfo;
import edu.kit.ipd.sdq.mediastore.basic.exceptions.FailedDownloadException;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.IFacade;
import edu.kit.ipd.sdq.mediastore.basic.utils.JNDIUtil;
import edu.kit.ipd.sdq.mediastore.web.utils.MessageUtil;

/**
 * @author Anastasia
 */
@ManagedBean(name = "downloadBean")
@ViewScoped
public class DownloadBean implements Serializable {

    private static final long serialVersionUID = -5118787891821223770L;

    @ManagedProperty(value = "#{sessionBean}")
    private SessionBean sessionBean;

    private List<AudioFileInfo> audios;
    private Map<AudioFileInfo, Boolean> checked = new HashMap<AudioFileInfo, Boolean>();
    private List<Long> audiosToDownload = new ArrayList<Long>();
    private final List<Integer> bitrates = new ArrayList<Integer>();
    private IFacade fasade;
    private StreamedContent file;

    @PostConstruct
    void init() {

        try {
            this.fasade = (IFacade) JNDIUtil.find(JNDIPool.FACADE);
            this.audios = this.fasade.getFileList();
        } catch (final NamingException e) {
            e.printStackTrace();
            MessageUtil.showError("Server wurde nicht gefunden.");
        }

    }

    public void download() {

        final StringBuilder nameForDownload = new StringBuilder();
        for (final Entry<AudioFileInfo, Boolean> item : this.checked.entrySet()) {
            if (item.getValue()) {
                final AudioFileInfo infoTemp = item.getKey();
                this.audiosToDownload.add(infoTemp.getId());
                nameForDownload.append("[").append(infoTemp.getTitle()).append("]"); // build name
// for download
                final Integer bitrate = infoTemp.getBitrate();
                if (bitrate != 128 && bitrate != 192 && bitrate != 256 && bitrate != 320) { // TODO:
// this is a hack, should be fixed in index.xhtml
                    MessageUtil.showError("Es muss fuer jeden Download eine Bitrate ausgewählt werden.");
                    return;
                }
                this.bitrates.add(bitrate);
            }
        }
        if (this.audiosToDownload != null) {
            final int downloadCount = this.audiosToDownload.size();
            if (downloadCount != 0) {
                try {
                    final byte[] fileContent = this.fasade.download(this.audiosToDownload, this.bitrates,
                            this.sessionBean.getCurrentUser().getEmail());

                    String contentType;
                    String fileName;
                    if (downloadCount == 1) {
                        contentType = "audio/mpeg";
                        nameForDownload.append(".mp3");

                    } else {
                        contentType = "application/zip";
                        nameForDownload.append(".zip");
                    }
                    fileName = nameForDownload.toString();
                    final InputStream is = new ByteArrayInputStream(fileContent);
                    this.file = new DefaultStreamedContent(is, contentType, fileName);

                } catch (final FailedDownloadException e) {
                    MessageUtil.showError(e.getMessage());
                } catch (final NamingException e) {
                    MessageUtil.showError("Server wurde nicht gefunden.");
                }
            }
        }

        // After Download clear all variables
        this.audiosToDownload.clear();
        this.bitrates.clear();
        nameForDownload.setLength(0);
    }

    public void check(final AjaxBehaviorEvent event) {
    }

    public SessionBean getSessionBean() {
        return this.sessionBean;
    }

    public void setSessionBean(final SessionBean sessionBean) {
        this.sessionBean = sessionBean;
    }

    public List<AudioFileInfo> getAudios() {
        return this.audios;
    }

    public void setAudios(final List<AudioFileInfo> audios) {
        this.audios = audios;
    }

    public IFacade getFasade() {
        return this.fasade;
    }

    public void setFasade(final IFacade fasade) {
        this.fasade = fasade;
    }

    public List<Long> getAudiosToDownload() {
        return this.audiosToDownload;
    }

    public void setAudiosToDownload(final List<Long> audiosToDownload) {
        this.audiosToDownload = audiosToDownload;
    }

    public Map<AudioFileInfo, Boolean> getChecked() {
        return this.checked;
    }

    public void setChecked(final Map<AudioFileInfo, Boolean> checked) {
        this.checked = checked;
    }

    public StreamedContent getFile() {
        return this.file;
    }

    public void setFile(final StreamedContent file) {
        this.file = file;
    }

    public void addAudioToList(final AudioFileInfo audioInfo) {
        this.audios.add(audioInfo);
    }

    public static String generateId(final String value, final Long index) {
        return value + "_" + index;
    }

}
