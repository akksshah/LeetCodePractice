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
 * <p>Leetcode question: 771</p>
 * <p>Link to question: https://leetcode.com/problems/jewels-and-stones/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> j = new HashSet<>();
        for (char ch : jewels.toCharArray()) {
            j.add(ch);
        }
        int c = 0;
        for (char ch : stones.toCharArray()) {
            if (j.contains(ch)) {
                c++;
            }
        }
        return c;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
