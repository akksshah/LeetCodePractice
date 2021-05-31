package medium;

import org.junit.Test;

import java.util.stream.IntStream;

import utility.ArrayAsString;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 189</p>
 * <p>Link to question: https://leetcode.com/problems/rotate-array/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        // O(n) Time and space complexity both
        int[] a = new int[nums.length];
        IntStream.range(0, nums.length).forEach(i -> a[(i + k) % nums.length] = nums[i]);
        System.arraycopy(a, 0, nums, 0, nums.length);
    }

    public void rotate2(int[] nums, int k) {
        // O(n) time, O(1) space complexity
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

    public void rotate3(int[] nums, int k) {
        // O(n) time O(1) space complexity
        // This approach is based on the fact that when we rotate the array k times,
        // k elements from the back end of the array come to the front and the
        // rest of the elements from the front shift backwards.
        // In this approach, we firstly reverse all the elements of the array.
        // Then, reversing the first k elements followed by reversing the rest n-k
        // elements gives us the required result.
        // Let n = 7 and k = 3
        // Original List                   : 1 2 3 4 5 6 7
        // After reversing all numbers     : 7 6 5 4 3 2 1
        // After reversing first k numbers : 5 6 7 4 3 2 1
        // After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result
        // k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    @Test
    public void test1() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
        assertEquals(ArrayAsString.stringify(arr), ArrayAsString.stringify(new int[]{5, 6, 7, 1, 2, 3, 4}));
    }

    @Test
    public void test2() {

    }
}
