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
 * <p>Leetcode question: 66</p>
 * <p>Link to question: https://leetcode.com/problems/plus-one/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1 ; i >= 0 ; i--) {
            digits[i] += carry;
            if (digits[i] > 9) {
                digits[i] = digits[i] % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            if (carry == 0) {
                break;
            }
        }
        if (carry == 1) {
            int[] ans = new int[digits.length + 1];
            System.arraycopy(digits, 0, ans, 1, digits.length);
            ans[0] = 1;
            return ans;
        }
        return digits;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
