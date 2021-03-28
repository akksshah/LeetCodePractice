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
 * <p>Leetcode question: 53</p>
 * <p>Link to question: https://leetcode.com/problems/maximum-subarray/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int currentValue = 0;
        for (int num : nums) {
            currentValue += num;
            if (currentValue < num) {
                currentValue = num;
            }
            if (maxValue < currentValue) {
                maxValue = currentValue;
            }
        }
        return maxValue;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
