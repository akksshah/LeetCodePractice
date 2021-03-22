package leetcode.medium;

import utility.ListNode;

public class Solution {
    public static void main(String[] args) {
        var s = new Add2Num();
        var l1 = new ListNode(2);
        var l1copy = l1.next = new ListNode(4);
        l1copy.next = new ListNode(6);

        var l2 = new ListNode(5);
        var l2copy = l2.next = new ListNode(6);
        l2copy.next = new ListNode(4);

        // result is ListNode
        var x = s.addTwoNumbers(l1, l2);
        System.out.println(x.toString());
    }
}
