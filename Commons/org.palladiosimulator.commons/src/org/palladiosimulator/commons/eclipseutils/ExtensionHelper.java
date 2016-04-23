package org.palladiosimulator.commons.eclipseutils;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;

/**
 * Helper class for coping with Eclipse extension points and extensions.
 * 
 * TODO ExtensionHelper lacks advanced filtering options. Use Java 1.8 Lambda expressions. [Lehrig]
 * 
 * @author Sebastian Lehrig
 */
public final class ExtensionHelper {

    /** Static helper classes shall not be instantiated. */
    private ExtensionHelper() {
    }

    /**
     * Gets all attributes registered at a given extension point at a given element and conforming
     * to a given attribute.
     * 
     * @param extensionPointID
     *            the extension point identifier; pointing to the extension point to get attributes
     *            from.
     * @param elementName
     *            the name of the configuration element.
     * @param attributeName
     *            the name of the attribute.
     * @return a list of attributes conforming to the given parameters.
     */
    public static List<String> getAttributes(final String extensionPointID, final String elementName,
            final String attributeName) {
        final List<IExtension> extensions = loadExtensions(extensionPointID);
        final List<String> results = new LinkedList<String>();

        for (final IExtension extension : extensions) {
            results.add(obtainConfigurationElement(extension, elementName).getAttribute(attributeName));
        }

        return Collections.unmodifiableList(results);
    }

    /**
     * Gets all executable extensions registered at a given extension point conforming to a given
     * attribute.
     * 
     * @param extensionPointID
     *            the extension point identifier; pointing to the extension point to get executable
     *            extensions from.
     * @param attributeName
     *            the name of the attribute.
     * @param <DATA_TYPE>
     *            the data type of the executable extension.
     * @return list of executable extension for the given attribute.
     */
    public static <DATA_TYPE> List<DATA_TYPE> getExecutableExtensions(final String extensionPointID,
            final String attributeName) {
        final List<DATA_TYPE> results = new LinkedList<DATA_TYPE>();

        if (Platform.getExtensionRegistry() != null) {
            final IConfigurationElement[] configurationElements = Platform.getExtensionRegistry()
                    .getConfigurationElementsFor(extensionPointID);
            for (final IConfigurationElement configurationElement : configurationElements) {
                try {
                    @SuppressWarnings("unchecked")
                    final DATA_TYPE executableExtension = (DATA_TYPE) configurationElement
                            .createExecutableExtension(attributeName);
                    results.add(executableExtension);
                } catch (final CoreException e) {
                    throw new RuntimeException("Unable to create executable extension for \"" + extensionPointID + "->"
                            + attributeName + "\"");
                }
            }
        }

        return Collections.unmodifiableList(results);
    }

    /**
     * Gets all executable extensions registered at a given extension point conforming to a given
     * attribute and filtered by the given attribute and its value.
     * 
     * @param extensionPointID
     *            the extension point identifier; pointing to the extension point to get executable
     *            extensions from.
     * @param attributeName
     *            the name of the attribute.
     * @param filterAttributeName
     *            the attribute to be used for filtering.
     * @param filterAttributeValue
     *            the atrribute's value to be used for filtering. Found attributes have to equal
     *            this value in case they should be chosen.
     * @param <DATA_TYPE>
     *            the data type of the executable extension.
     * @return list of executable extension for the given attribute.
     */
    public static <DATA_TYPE> DATA_TYPE getExecutableExtension(final String extensionPointID,
            final String attributeName, final String filterAttributeName, final String filterAttributeValue) {
        if (Platform.getExtensionRegistry() != null) {
            final IConfigurationElement[] configurationElements = Platform.getExtensionRegistry()
                    .getConfigurationElementsFor(extensionPointID);
            for (final IConfigurationElement configurationElement : configurationElements) {
                if (configurationElement.getAttribute(filterAttributeName).equals(filterAttributeValue)) {
                    try {
                        @SuppressWarnings("unchecked")
                        final DATA_TYPE executableExtension = (DATA_TYPE) configurationElement
                                .createExecutableExtension(attributeName);
                        return executableExtension;
                    } catch (final CoreException e) {
                        throw new RuntimeException("Unable to create executable extension for \"" + extensionPointID
                                + "->" + attributeName + "\"");
                    }
                }
            }
        }

        throw new RuntimeException(
                "Unable to create executable extension for \"" + extensionPointID + "->" + attributeName + "\"");
    }

    /**
     * Gets all executable extensions registered at a given extension point at a given element and
     * conforming to a given attribute.
     * 
     * @param extensionPointID
     *            the extension point identifier; pointing to the extension point to get executable
     *            extensions from.
     * @param elementName
     *            the name of the configuration element.
     * @param attributeName
     *            the name of the attribute.
     * @param <DATA_TYPE>
     *            the data type of the executable extension.
     * @return list of executable extension for the given attribute.
     */
    public static <DATA_TYPE> List<DATA_TYPE> getExecutableExtensions(final String extensionPointID,
            final String elementName, final String attributeName) {
        final List<DATA_TYPE> results = new LinkedList<DATA_TYPE>();
        final List<IExtension> extensions = loadExtensions(extensionPointID);
        for (final IExtension extension : extensions) {
            try {
                @SuppressWarnings("unchecked")
                final DATA_TYPE executableExtension = (DATA_TYPE) obtainConfigurationElement(extension, elementName)
                        .createExecutableExtension(attributeName);
                results.add(executableExtension);
            } catch (final CoreException e) {
                throw new RuntimeException("Unable to create executable extension for \"" + extensionPointID + "->"
                        + elementName + "->" + attributeName + "\"");
            }
        }

        return Collections.unmodifiableList(results);
    }

    /**
     * Gets an executable extension registered at a given extension point at a given element and
     * conforming to a given attribute and filtered by the given attribute and its value.
     * 
     * @param extensionPointID
     *            the extension point identifier; pointing to the extension point to get executable
     *            extensions from.
     * @param elementName
     *            the name of the configuration element.
     * @param attributeName
     *            the name of the attribute.
     * @param filterAttributeName
     *            the attribute to be used for filtering.
     * @param filterAttributeValue
     *            the atrribute's value to be used for filtering. Found attributes have to equal
     *            this value in case they should be chosen.
     * @return an executable extension matching to all selection criteria defined by this method's
     *         parameters.
     * @param <DATA_TYPE>
     *            the data type of the executable extension.
     */
    public static <DATA_TYPE> DATA_TYPE getExecutableExtension(final String extensionPointID, final String elementName,
            final String attributeName, final String filterAttributeName, final String filterAttributeValue) {
        final List<IExtension> extensions = loadExtensions(extensionPointID);

        for (final IExtension extension : extensions) {
            final IConfigurationElement configurationElement = obtainConfigurationElement(extension, elementName);

            if (configurationElement.getAttribute(filterAttributeName).equals(filterAttributeValue)) {
                try {
                    @SuppressWarnings("unchecked")
                    final DATA_TYPE executableExtension = (DATA_TYPE) configurationElement
                            .createExecutableExtension(attributeName);
                    return executableExtension;
                } catch (final CoreException e) {
                }
            }
        }

        throw new RuntimeException("Could not create executable extension \"" + extensionPointID + "->" + elementName
                + "->" + attributeName + "\" with filter \"" + filterAttributeName + "\" = \"" + filterAttributeValue
                + "\"");
    }

    /**
     * Gets the configuration element matching to the given element name and for a given extension.
     * 
     * @param extension
     *            the extension to be investigated.
     * @param elementName
     *            the configuration element name to be matched.
     * @return a matched configuration element.
     */
    private static IConfigurationElement obtainConfigurationElement(final IExtension extension,
            final String elementName) {
        for (final IConfigurationElement element : extension.getConfigurationElements()) {
            if (element.getName().equals(elementName)) {
                return element;
            }
        }

        throw new RuntimeException("Could not find extension for element \"" + elementName + "\"");
    }

    /**
     * Loads all extensions of a given extension point.
     * 
     * @param extensionPointID
     *            the extension point identifier; pointing to the extension point to get executable
     *            extensions from.
     * @return list of extensions at the given extension point.
     */
    private static List<IExtension> loadExtensions(final String extensionPointID) {
        return Collections.unmodifiableList(
                Arrays.asList(Platform.getExtensionRegistry().getExtensionPoint(extensionPointID).getExtensions()));
    }

}
