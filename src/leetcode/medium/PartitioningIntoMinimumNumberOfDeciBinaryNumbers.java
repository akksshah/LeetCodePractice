package leetcode.medium;

import org.junit.Test;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1689</p>
 * <p>Link to question: https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        int max = 0;
        for (char ch : String.valueOf(n).toCharArray()) {
            if (ch - '0' > max) {
                max = ch - '0';
            }
        }
        return max;
    }

    @Test
    public void test1() {
        assertEquals(3, minPartitions("32"));
    }

    @Test
    public void test2() {
        assertEquals(8, "82734");
    }

    @Test
    public void test3() {
        assertEquals(9, "27346209830709182346");
    }
}
