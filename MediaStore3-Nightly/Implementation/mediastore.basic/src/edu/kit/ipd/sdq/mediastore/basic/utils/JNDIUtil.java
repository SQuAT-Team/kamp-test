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
package edu.kit.ipd.sdq.mediastore.basic.utils;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.kit.ipd.sdq.mediastore.basic.config.JNDIPool;

public class JNDIUtil {

    public static Object find(final JNDIPool _jndi) throws NamingException {

        final InitialContext ctx1 = new InitialContext(PropertiesUtil.initProperties(_jndi));

        return ctx1.lookup(_jndi.jndi);

    }

}
