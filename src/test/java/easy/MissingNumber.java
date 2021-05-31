package easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 268</p>
 * <p>Link to question: https://leetcode.com/problems/missing-number/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        return (((nums.length * (nums.length + 1)) / 2) - Arrays.stream(nums).sum());
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
