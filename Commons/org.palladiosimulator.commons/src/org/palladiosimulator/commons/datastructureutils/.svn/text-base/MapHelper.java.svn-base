package org.palladiosimulator.commons.datastructureutils;

import java.util.Map;

/**
 * Helper for coping with maps.
 * 
 * @author Sebastian Lehrig
 */
public class MapHelper {

    /**
     * Convenience method for getting a certain attribute from a given map.
     * 
     * @param map
     *            the map to be investigated.
     * @param key
     *            the key to look for.
     * @param dataTypeClass
     *            the data type class of the value to look for.
     * @param <DATA_TYPE>
     *            the data type of the value.
     * @return the value to look for.
     */
    public static <DATA_TYPE> DATA_TYPE getValue(final Map<String, Object> map, final String key,
            final Class<DATA_TYPE> dataTypeClass) {
        @SuppressWarnings("unchecked")
        final DATA_TYPE result = (DATA_TYPE) map.get(key);
        if (result == null) {
            throw new RuntimeException("Expected configuation entry not found");
        }
        if (!dataTypeClass.isInstance(result)) {
            throw new RuntimeException("Data in configuration does not have expected type");
        }

        return result;
    }
}
