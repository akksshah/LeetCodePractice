package leetcode.easy;

import org.junit.Test;

import utility.ListNode;

/**
 * <p>Leetcode question: 237</p>
 * <p>Link to question: https://www.leetcode.com/problems/delete-node-in-a-linked-list/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
