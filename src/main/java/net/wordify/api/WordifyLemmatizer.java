package net.wordify.api;

import java.util.Iterator;

/**
 * Extract base form of word from specified word
 */
public interface WordifyLemmatizer extends WordifyFeature {
    /**
     * Returns base form of words from specified stream of words
     *
     * @param words Stream of words
     */
    Iterator<String> extract(Iterator<String> words);
}
