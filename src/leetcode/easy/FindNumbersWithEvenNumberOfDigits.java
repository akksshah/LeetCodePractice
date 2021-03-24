package leetcode.easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1295 </p>
 * <p>Link to question: https://leetcode
 * .com/problems/find-numbers-with-even-number-of-digits/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        return Arrays.stream(nums).mapToObj(String::valueOf).filter(i -> i.length() % 2 == 0).collect(Collectors.toList()).size();
    }

    @Test
    public void test1() {
        assertEquals(2, findNumbers(new int[]{12, 345, 2, 6, 7896}));
    }

    @Test
    public void test2() {

    }
}
