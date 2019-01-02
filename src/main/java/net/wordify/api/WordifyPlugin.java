package net.wordify.api;

/**
 * Entry-point of any plugin
 */
public interface WordifyPlugin {
    /**
     * Unique name of a plugin
     */
    String getName();

    /**
     * Description of a plugin
     */
    String getDescription();

    /**
     * Checks if plugin supports specified feature for the language
     *
     * @param lang  Language code
     * @param clazz Concrete feature-interface inherited from {@link WordifyFeature}
     * @return <code>true</code> if supported
     */
    <T extends WordifyFeature> boolean hasSupport(String lang, Class<T> clazz);

    /**
     * Returns implemented instance of specified feature
     *
     * @param lang  Language code
     * @param clazz Concrete feature-interface inherited from {@link WordifyFeature}
     * @return instance of <tt>T</tt>. Can be <tt>null</tt>
     */
    <T extends WordifyFeature> T getFeature(String lang, Class<T> clazz);
}
