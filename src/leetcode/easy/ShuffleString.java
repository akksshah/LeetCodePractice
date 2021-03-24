package leetcode.easy;

import org.junit.Test;

import java.util.stream.IntStream;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1528</p>
 * <p>Link to question: https://leetcode.com/problems/shuffle-string/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[indices.length];
        IntStream.range(0, s.length()).forEach(i -> ch[indices[i]] = s.charAt(i));
        return new String(ch);
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
