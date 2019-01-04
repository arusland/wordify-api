package net.wordify.api;

import java.util.Iterator;

/**
 * Parse raw text into potential words (pre-processing)
 */
public interface WordifyTokenizer extends WordifyFeature {
    /**
     * Parse raw text into tokens
     *
     * @param raw Raw text
     * @return List of words/phrases
     */
    Iterator<String> parse(String raw);

    /**
     * Checks if specified token is proper
     *
     * @param token token
     */
    boolean isLegalToken(String token);
}
