package leetcode.easy;

import org.junit.Test;

import utility.ArrayAsString;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 283</p>
 * <p>Link to question: https://leetcode.com/problems/move-zeroes/ </p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int zeroIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (zeroIndex == -1 && nums[i] == 0) {
                zeroIndex = i;
            }
            if (nums[i] != 0 && zeroIndex != -1) {
                nums[zeroIndex] = nums[i];
                zeroIndex = -1;
                nums[i] = 0;
                i = zeroIndex;
            }
        }
    }

    @Test
    public void test1() {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        MoveZeros moveZeros = new MoveZeros();
        moveZeros.moveZeroes(arr);
        assertEquals(ArrayAsString.stringify(new int[]{1, 3, 12, 0, 0}), ArrayAsString.stringify(arr));
    }

    @Test
    public void test2() {

    }
}
