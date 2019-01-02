package net.wordify.api;

/**
 * Base type for any feature
 */
public interface WordifyFeature {
    /**
     * Returns supported language code
     */
    String getLang();
}
