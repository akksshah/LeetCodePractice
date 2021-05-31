package easy;

import org.junit.Test;

import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1290</p>
 * <p>Link to question: https://leetcode
 * .com/problems/convert-binary-number-in-a-linked-list-to-integer/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result = result << 1;
            result += head.val;
            head = head.next;
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
