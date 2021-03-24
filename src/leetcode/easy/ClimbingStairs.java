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
 * <p>Leetcode question: 70</p>
 * <p>Link to question: https://leetcode.com/problems/climbing-stairs/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3 ; i <= n ; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
