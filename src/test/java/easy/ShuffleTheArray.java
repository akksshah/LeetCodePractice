package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1470</p>
 * <p>Link to question: https://leetcode.com/problems/shuffle-the-array/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int pointer = 0;
        for (int i = 0 ; i < n ; i++) {
            result[pointer++] = nums[i];
            result[pointer++] = nums[n + i];
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
