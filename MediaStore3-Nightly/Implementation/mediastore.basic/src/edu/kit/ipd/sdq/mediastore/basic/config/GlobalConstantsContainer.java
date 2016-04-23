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
package edu.kit.ipd.sdq.mediastore.basic.config;

public class GlobalConstantsContainer {
    public static final String SEPARATOR = System.getProperty("file.separator");

    public static final String IP_REMOTE1 = "141.3.52.32";
    public static final String IP_REMOTE2 = "141.3.52.33";
    public static final String IP_LOCAL = "localhost";

    // LOCAL Test Config
//	public static final String IP1 = IP_LOCAL;
//	public static final String TEMP_DIR_PATH = "C:\\temp\\temp";
//	private final static String FILE_DIR_WIN = "C:\\audios\\";

    // Productive 2 Server Config
//	public static final String IP1 = IP_REMOTE1;
//	public static final String IP2 = IP_REMOTE2;
//	public static final String TEMP_DIR_PATH = "E:\\";
//	private final static String FILE_DIR_WIN = "\\\\MEDIASTORE2\\audios\\";

    // Productive 1 Server Config
//	public static final String IP1 = IP_REMOTE1;
//	public static final String TEMP_DIR_PATH = "E:\\";
//	private final static String FILE_DIR_WIN = "C:\\audios\\";

    // Productive 2 Server Config, data on Server 1
    public static final String IP1 = IP_REMOTE1;
    public static final String IP2 = IP_REMOTE2;
    public static final String TEMP_DIR_PATH = "E:\\";
    private final static String FILE_DIR_WIN = "C:\\audios\\";

    private static String OS = System.getProperty("os.name").toLowerCase();
    private final static String FILE_DIR_LINUX = "/home/audios";

    public static String getFileDir() {
//    	System.out.println(OS);
        if (OS.indexOf("win") >= 0) {
            return FILE_DIR_WIN;
        }
        return FILE_DIR_LINUX;
    }

    public static final int CACHE_CAPACITY = 30; // in items, not size
}
