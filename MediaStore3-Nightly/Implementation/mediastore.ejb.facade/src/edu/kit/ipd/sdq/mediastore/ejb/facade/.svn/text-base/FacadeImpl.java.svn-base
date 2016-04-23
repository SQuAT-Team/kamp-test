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
package edu.kit.ipd.sdq.mediastore.ejb.facade;

import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.Stateless;
import javax.naming.NamingException;

import edu.kit.ipd.sdq.mediastore.basic.config.JNDIPool;
import edu.kit.ipd.sdq.mediastore.basic.data.AudioFile;
import edu.kit.ipd.sdq.mediastore.basic.data.AudioFileInfo;
import edu.kit.ipd.sdq.mediastore.basic.data.CurrentUser;
import edu.kit.ipd.sdq.mediastore.basic.data.UserRegData;
import edu.kit.ipd.sdq.mediastore.basic.exceptions.BadLoginDataException;
import edu.kit.ipd.sdq.mediastore.basic.exceptions.FailedDownloadException;
import edu.kit.ipd.sdq.mediastore.basic.exceptions.FailedUploadException;
import edu.kit.ipd.sdq.mediastore.basic.exceptions.UserAlreadyExistsException;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.IFacade;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.IMediaManagement;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.IUserManagement;
import edu.kit.ipd.sdq.mediastore.basic.utils.JNDIUtil;

/**
 * @author Anastasia
 */

@Stateless
public class FacadeImpl implements IFacade {

    private static final long serialVersionUID = 308982198674607428L;

    IUserManagement userManagement;

    IMediaManagement mediaManagement;

//    /*
//     * Funktioniert nur mit den local EJB!!!
//     *
//     * @EJB(lookup="ejb/UserAdapterImpl")
//     *  private IUserDBAdapter userAdapter;
//     */
//    @PostConstruct
//    public void init() {
//        /*
//         * JNDI wird in GlassFish console als external JNDI resource definiert!
//         *
//         * InitialContext ctx = new InitialContext();
//         * IUserDBAdapter userAdapter = (IUserDBAdapter) ctx.lookup("ejb/UserAdapterImpl");
//         */
//    }

    private void initMediaManager() throws NamingException {
        if (this.mediaManagement == null) {
            this.mediaManagement = (IMediaManagement) JNDIUtil.find(JNDIPool.MEDIA_MANAGEMENT);
        }
    }

    private void initUserManagement() throws NamingException {
        if (this.userManagement == null) {
            this.userManagement = (IUserManagement) JNDIUtil.find(JNDIPool.USER_MANAGEMENT);
        }
    }

    @Override
    public Long register(final UserRegData user) throws UserAlreadyExistsException, NamingException {
        this.initUserManagement();
        return this.userManagement.register(user);
    }

    @Override
    public CurrentUser login(final String username, final String password) throws BadLoginDataException,
            NamingException {
        this.initUserManagement();
        return this.userManagement.login(username, password);
    }

    @Override
    public Long upload(final AudioFile file) throws FailedUploadException, NamingException, RemoteException {
        this.initMediaManager();
        return this.mediaManagement.upload(file);
    }

    @Override
    public List<AudioFileInfo> getFileList() throws NamingException {
        this.initMediaManager();
        return this.mediaManagement.getFileList();
    }

    @Override
    public byte[] download(final List<Long> id, final List<Integer> bitrates, final String downloaderLogin)
            throws FailedDownloadException, NamingException {
        System.out.println("Bitrates " + bitrates.toString());
        this.initMediaManager();
        return this.mediaManagement.download(id, bitrates, downloaderLogin);
    }

    @Override
    public void downloadTest(final List<Long> id, final List<Integer> bitrates, final String downloaderLogin)
            throws FailedDownloadException, NamingException {
        this.initMediaManager();
        final byte[] bytes = this.mediaManagement.download(id, bitrates, downloaderLogin);
        bytes.equals("42"); // prevent optimization
    }
}
