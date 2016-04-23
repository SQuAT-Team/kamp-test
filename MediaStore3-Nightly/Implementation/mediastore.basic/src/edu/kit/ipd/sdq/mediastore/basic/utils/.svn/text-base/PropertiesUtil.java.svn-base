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

import java.util.Properties;

import javax.naming.Context;

import edu.kit.ipd.sdq.mediastore.basic.config.JNDIPool;

public class PropertiesUtil {

    public static Properties initProperties(final JNDIPool _interface) {

        final String port = _interface.port;
        final String host = _interface.host;
        final String initContextFactory = _interface.initContextFactory;

        final Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, initContextFactory);
        props.setProperty("org.omg.CORBA.ORBInitialHost", host);
        props.setProperty("org.omg.CORBA.ORBInitialPort", port);

        return props;
    }

}
