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
 * <p>Leetcode question: 1342</p>
 * <p>Link to question: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        return num == 0
               ? 0
               : 1 + ((num % 2 == 1)
                      ? numberOfSteps(num - 1)
                      : numberOfSteps(num / 2));
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
