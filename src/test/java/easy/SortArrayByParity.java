package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 905</p>
 * <p>Link to question: https://leetcode.com/problems/sort-array-by-parity/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] a) {
        int[] ans = new int[a.length];
        int p = 0;
        for (int j : a) {
            if (j % 2 == 0) {
                ans[p++] = j;
            }
        }
        for (int j : a) {
            if (j % 2 == 1) {
                ans[p++] = j;
            }
        }
        return ans;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
