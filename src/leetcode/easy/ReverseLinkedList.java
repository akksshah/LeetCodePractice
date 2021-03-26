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
 * <p>Leetcode question: 206</p>
 * <p>Link to question: https://leetcode.com/problems/reverse-linked-list/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode current = head;
            head = head.next;
            current.next = prev;
            prev = current;
        }
        return prev;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}