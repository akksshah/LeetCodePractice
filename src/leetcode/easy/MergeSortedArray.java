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
 * <p>Leetcode question: 88</p>
 * <p>Link to question: https://leetcode.com/problems/merge-sorted-array/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-- + n-- - 1;
        for ( ; i >= 0 && m >= 0 && n >= 0 ; i--) {
            if (nums1[m] > nums2[n]) {
                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }
        }
        if (m < 0) {
            while (n >= 0) {
                nums1[i--] = nums2[n--];
            }
        } else {
            while (m >= 0) {
                nums1[i--] = nums1[m--];
            }
        }
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
