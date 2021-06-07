package easy;

import org.junit.Test;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 746</p>
 * <p>Link to question: https://leetcode.com/problems/min-cost-climbing-stairs/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] memo = new int[cost.length + 1];
        IntStream.range(2, memo.length).forEach(i -> memo[i] = Math.min(memo[i - 1] + cost[i - 1], memo[i - 2] + cost[i - 2]));
        return memo[memo.length - 1];
    }

    @Test
    public void test1() {
        assertEquals(6, minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    @Test
    public void test2() {
        assertEquals(15, minCostClimbingStairs(new int[]{10, 15, 20}));
    }
}