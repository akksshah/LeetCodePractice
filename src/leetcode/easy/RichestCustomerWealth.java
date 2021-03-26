package leetcode.easy;

import org.junit.Test;

import java.util.Arrays;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1672</p>
 * <p>Link to question: https://leetcode.com/problems/richest-customer-wealth/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            max = Math.max(max, Arrays.stream(account, 0, accounts[0].length).sum());
        }
        return max;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
