package leetcode.easy;

import org.junit.Test;

import java.util.stream.IntStream;

/**
 * <p>Leetcode question: 1480</p>
 * <p>Link to question: https://www.leetcode.com/problems/running-sum-of-1d-array/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution</p>
 */
public class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        int [] result = new int[nums.length];
        int currentSum = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            currentSum += nums[i];
            result[i] = currentSum;
        }
        return result;
    }

    public int[] runningSum2(int[] nums) {
        IntStream.range(1, nums.length).forEach(i -> nums[i] += nums[i - 1]);
        return nums;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
