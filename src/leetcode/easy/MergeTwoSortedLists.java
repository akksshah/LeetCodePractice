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
 * <p>Leetcode question: 21</p>
 * <p>Link to question: https://leetcode.com/problems/merge-two-sorted-lists/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(-1);
        ListNode head = l;
        while (l1 != null && l2 != null) {
            if (l1.val < l2. val) {
                l.next = l1;
                l1 = l1.next;
            } else {
                l.next = l2;
                l2 = l2.next;
            }
            l = l.next;
        }
        if (l1 != null) {
            l.next = l1;
        }
        if (l2 != null) {
            l.next = l2;
        }
        return head.next;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
