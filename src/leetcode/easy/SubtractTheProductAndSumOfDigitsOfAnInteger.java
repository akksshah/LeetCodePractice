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
 * <p>Leetcode question: 1281</p>
 * <p>Link to question: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        int p = 1;
        int sum = 0;
        if ( n < 10) {
            return 0; // Short Circuit
        }
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            p *= rem;
            n /= 10;
        }
        return p - sum;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
