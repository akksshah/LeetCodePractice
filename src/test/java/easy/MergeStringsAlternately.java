package easy;

import org.junit.Test;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1768</p>
 * <p>Link to question: https://leetcode.com/problems/merge-strings-alternately/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int i = 0;
        for ( ; i < word1.length() && i < word2.length() ; i++) {
            s.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (word1.length() > i) {
            s.append(word1.substring(i));
        }

        if (word2.length() > i) {
            s.append(word2.substring(i));
        }
        return s.toString();
    }
    @Test
    public void test1() {
        assertEquals("apbqcr", mergeAlternately("abc", "pqr"));
    }

    @Test
    public void test2() {
        assertEquals("apbqrs", mergeAlternately("ab", "pqrs"));
    }
}