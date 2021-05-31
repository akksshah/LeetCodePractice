package easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1662</p>
 * <p>Link to question: https://leetcode
 * .com/problems/check-if-two-string-arrays-are-equivalent/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class CheckIfTwoArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return Arrays.stream(word1).collect(Collectors.joining()).equals(Arrays.stream(word2).collect(Collectors.joining()));
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
