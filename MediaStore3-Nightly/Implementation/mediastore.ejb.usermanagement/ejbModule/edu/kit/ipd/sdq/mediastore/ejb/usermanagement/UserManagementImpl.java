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
package edu.kit.ipd.sdq.mediastore.ejb.usermanagement;

import javax.ejb.Stateless;
import javax.naming.NamingException;

import edu.kit.ipd.sdq.mediastore.basic.config.JNDIPool;
import edu.kit.ipd.sdq.mediastore.basic.data.CurrentUser;
import edu.kit.ipd.sdq.mediastore.basic.data.UserRegData;
import edu.kit.ipd.sdq.mediastore.basic.exceptions.BadLoginDataException;
import edu.kit.ipd.sdq.mediastore.basic.exceptions.UserAlreadyExistsException;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.IUserDBAdapter;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.IUserManagement;
import edu.kit.ipd.sdq.mediastore.basic.utils.JNDIUtil;

@Stateless
public class UserManagementImpl implements IUserManagement {

    private IUserDBAdapter userAdapter;

    private void initUserAdapter() throws NamingException {
        if (this.userAdapter == null) {
            this.userAdapter = (IUserDBAdapter) JNDIUtil.find(JNDIPool.USER_DB_ADAPTER);
        }
    }

    @Override
    public Long register(final UserRegData user) throws UserAlreadyExistsException, NamingException {
        this.initUserAdapter();
        final String passwordHash = SecurityUtil.computeHash(user.getPassword());
        user.setPassword(passwordHash);
        return this.userAdapter.addUser(user);
    }

    @Override
    public CurrentUser login(final String username, final String password) throws BadLoginDataException,
            NamingException {
        this.initUserAdapter();
        final CurrentUser user = this.userAdapter.getUserData(username, password);
        if (!SecurityUtil.isEqual(password, user.getPasswordHash())) {
            throw new BadLoginDataException();
        }
        return user;
    }

}
