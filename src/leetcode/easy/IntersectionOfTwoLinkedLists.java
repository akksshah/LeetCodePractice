package leetcode.easy;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 160</p>
 * <p>Link to question: https://leetcode.com/problems/intersection-of-two-linked-lists/</p>
 * <p>Link to solution: No</p>
 * <p>Link to preferred solution: part 2</p>
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> nodesInA = new HashSet<>();
        ListNode head = headA;
        while (head != null) {
            nodesInA.add(head);
            head = head.next;
        }
        head = headB;
        while (head != null) {
            if (nodesInA.contains(head)) {
                return head;
            }
            head = head.next;
        }
        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        //boundary check
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        return a;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
