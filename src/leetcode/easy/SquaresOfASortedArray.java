package leetcode.easy;

import org.junit.Test;

import java.util.Arrays;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 977</p>
 * <p>Link to question: https://leetcode.com/problems/squares-of-a-sorted-array/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        Arrays.setAll(nums, i -> nums[i] * nums[i]);
        Arrays.sort(nums);
        return nums;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
