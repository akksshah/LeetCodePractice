package leetcode.easy;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1684</p>
 * <p>Link to question: https://leetcode
 * .com/problems/count-the-number-of-consistent-strings/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> s = new HashSet<>();
        for (char ch : allowed.toCharArray()) {
            s.add(ch);
        }
        int c = 0;
        for (String w : words) {
            int curr = 0;
            for (char ch : w.toCharArray()) {
                if (s.contains(ch)) {
                    curr++;
                } else {
                    break;
                }
            }
            c += (curr == w.length() ? 1 : 0);
        }
        return c;
    }

    @Test
    public void test1() {
        assertEquals(2, countConsistentStrings("ab", new String[]{"ad", "bd",
                "aaab", "baa", "badab"}));
    }

    @Test
    public void test2() {
        assertEquals(7, countConsistentStrings("abc", new String[]{"a", "b",
                "c", "ab", "ac", "bc", "abc"}));
    }

    @Test
    public void test3() {
        assertEquals(4, countConsistentStrings("cad", new String[]{"cc", "acd"
                , "b", "ba", "bac", "bad", "ac", "d"}));
    }
}
