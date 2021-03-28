package leetcode.easy;

import org.junit.Test;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 190</p>
 * <p>Link to question: https://leetcode.com/problems/reverse-bits/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ReverseBits {
    public int reverseBits(int n) {
        if (n == 0) {
            return 0;
        }

        int result = 0;
        for (int i = 0 ; i < 32 ; i++) {
            result <<= 1;
            if ((n & 1) == 1) {
                result++;
            }
            n >>= 1;
        }
        return result;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
