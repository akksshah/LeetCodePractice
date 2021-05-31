package medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 284</p>
 * <p>Link to question: https://leetcode.com/problems/shuffle-an-array/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ShuffleAnArray {
    class Solution {
        private int[] nums;
        private final int[] original;

        public Solution(int[] nums) {
            this.nums = nums;
            original = new int[nums.length];
            System.arraycopy(nums, 0, original, 0, nums.length);
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            nums = original;
            return nums;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            List<Integer> list =
                    Arrays.stream(nums).boxed().collect(Collectors.toList());
            Collections.shuffle(list);
            nums = list.stream().mapToInt(i -> i).toArray();
            return nums;
        }
    }

    /**
     * Your Solution object will be instantiated and called as such: Solution
     * obj = new Solution(nums); int[] param_1 = obj.reset(); int[] param_2 =
     * obj.shuffle();
     */

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
