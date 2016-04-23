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

public enum JNDIPool {

    USER_DB_ADAPTER("java:global/mediastore.ear.userdbadapter/mediastore.ejb.userdbadapter-1.0/UserDBAdapterImpl",
            GlobalConstantsContainer.IP1, "3700", "com.sun.enterprise.naming.SerialInitContextFactory", "UserDBAdapter"), USER_MANAGEMENT(
            "java:global/mediastore.ear.usermanagement/mediastore.ejb.usermanagement-1.0/UserManagementImpl",
            GlobalConstantsContainer.IP1, "3700", "com.sun.enterprise.naming.SerialInitContextFactory",
            "UserManagement"), MEDIA_ACCESS(
            "java:global/mediastore.ear.mediaaccess/mediastore.ejb.mediaaccess-1.0/MediaAccessImpl!edu.kit.ipd.sdq.mediastore.basic.interfaces.IMediaAccess",
            GlobalConstantsContainer.IP1, "3700", "com.sun.enterprise.naming.SerialInitContextFactory", "MediaAccess"), MEDIA_ACCESS_DOWNLOAD(
            "java:global/mediastore.ear.mediaaccess/mediastore.ejb.mediaaccess-1.0/MediaAccessImpl!edu.kit.ipd.sdq.mediastore.basic.interfaces.IDownloadMediaAccess",
            GlobalConstantsContainer.IP1, "3700", "com.sun.enterprise.naming.SerialInitContextFactory",
            "MediaAccessDownload"), MEDIA_ACCESS_MAINTENANCE(
            "java:global/mediastore.ear.mediaaccess/mediastore.ejb.mediaaccess-1.0/MediaAccessImpl!edu.kit.ipd.sdq.mediastore.basic.interfaces.IMediaAccessMaintenance",
            GlobalConstantsContainer.IP1, "3700", "com.sun.enterprise.naming.SerialInitContextFactory",
            "MediaAccessMaintenance"), MEDIA_MANAGEMENT(
            "java:global/mediastore.ear.mediamanagement/mediastore.ejb.mediamanagement-1.0/MediaManagementImpl",
            GlobalConstantsContainer.IP1, "3700", "com.sun.enterprise.naming.SerialInitContextFactory",
            "MediaManagement"), FACADE("java:global/mediastore.ear.facade/mediastore.ejb.facade-1.0/FacadeImpl",
            GlobalConstantsContainer.IP1, "3700", "com.sun.enterprise.naming.SerialInitContextFactory", "Facade"), AUDIO_WATERMARKING(
            "java:global/mediastore.ear.audiowatermarking/mediastore.ejb.audiowatermarking-1.0/AudioWatermarkingImpl",
            GlobalConstantsContainer.IP1, "3700", "com.sun.enterprise.naming.SerialInitContextFactory",
            "AudioWatermarking"), TAG_WATERMARKING(
            "java:global/mediastore.ear.tagwatermarking/mediastore.ejb.tagwatermarking-1.0/TagWatermarkingImpl",
            GlobalConstantsContainer.IP1, "3700", "com.sun.enterprise.naming.SerialInitContextFactory",
            "TagWatermarking"), REENCODER(
            "java:global/mediastore.ear.reencoder/mediastore.ejb.reencoder-1.0/ReEncoderImpl",
            GlobalConstantsContainer.IP1, "3700", "com.sun.enterprise.naming.SerialInitContextFactory", "ReEncoding"), CACHE(
            "java:global/mediastore.ear.cache/mediastore.ejb.cache-1.0/CacheImpl!edu.kit.ipd.sdq.mediastore.basic.interfaces.IDownloadCache",
            GlobalConstantsContainer.IP1, "3700", "com.sun.enterprise.naming.SerialInitContextFactory", "Cache"), CACHE_MAINTENANCE(
            "java:global/mediastore.ear.cache/mediastore.ejb.cache-1.0/CacheImpl!edu.kit.ipd.sdq.mediastore.basic.interfaces.ICacheMaintenance",
            GlobalConstantsContainer.IP1, "3700", "com.sun.enterprise.naming.SerialInitContextFactory",
            "CacheMaintenance"), PACKAGING(
            "java:global/mediastore.ear.packaging/mediastore.ejb.packaging-1.0/PackagingImpl",
            GlobalConstantsContainer.IP1, "3700", "com.sun.enterprise.naming.SerialInitContextFactory", "Packaging");

    public String jndi;
    public String host;
    public String port;
    public String initContextFactory;
    public String name; // informal

    private JNDIPool(final String jndi, final String host, final String port, final String initContextFactory,
            final String name) {
        this.jndi = jndi;
        this.host = host;
        this.port = port;
        this.initContextFactory = initContextFactory;
        this.name = name;
    }
}
