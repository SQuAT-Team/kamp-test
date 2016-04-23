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
package edu.kit.ipd.sdq.mediastore.ejb.packaging;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.ejb.Stateless;

import edu.kit.ipd.sdq.mediastore.basic.data.AudioFile;
import edu.kit.ipd.sdq.mediastore.basic.interfaces.IPackaging;

/**
 * Session Bean implementation class Packaging
 */

@Stateless
public class PackagingImpl implements IPackaging {

    /**
     *
     */
    private static final long serialVersionUID = 7507720547495222404L;

    static final int BUFFER = 2048;

    /**
     * Default constructor.
     */
    public PackagingImpl() {
    }

    private static void addFileToZip(final ZipOutputStream zos, final String szName, final byte[] bb) throws Exception {
        ZipEntry entry;
        entry = new ZipEntry(szName);
        zos.putNextEntry(entry);

        // copy byte array (file content) into input stream
        final InputStream is = new ByteArrayInputStream(bb);

        final byte[] buf = new byte[8000];
        int nLength;
        while (true) {
            nLength = is.read(buf);
            if (nLength < 0) {
                break;
            }
            zos.write(buf, 0, nLength);
        }

        is.close();
        zos.closeEntry();
    }

    @Override
    public byte[] zip(final List<AudioFile> fileList) {

        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {

            // creates a ZipOutputStream object, to which we pass the output stream we wish to write
// to
            final ZipOutputStream zipOut = new ZipOutputStream(outputStream);

            for (final ListIterator<AudioFile> i = fileList.listIterator(); i.hasNext();) {

                // get next AudioFile and moving forward in List
                final AudioFile audioFileToAdd = i.next();

                addFileToZip(zipOut, audioFileToAdd.getFilename(), audioFileToAdd.getBytes());
            }

            zipOut.close();

        } catch (final Exception e) {
            e.printStackTrace();
        }

        return outputStream.toByteArray();
    }
}
