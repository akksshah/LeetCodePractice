package leetcode.medium;

public class Add2Num {
    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode l1 = new ListNode(2);
        ListNode l1copy = l1.next = new ListNode(4);
        l1copy.next = new ListNode(6);

        ListNode l2 = new ListNode(5);
        ListNode l2copy = l2.next = new ListNode(6);
        l2copy.next = new ListNode(4);

        var x = s.addTwoNumbers(l1, l2);
        System.out.println("Done");
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;

    ListNode next;

    public ListNode() {}

    public ListNode(int val) { this.val = val; }

    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    private ListNode head = new ListNode(0);
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var node = head;
        int carry = 0;
        while (l1 != null && l2 != null) {
            carry = helper(l1, l2, carry);
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int val = carry + l1.val;
            if (val > 10) {
                head.next = new ListNode(val % 10);
                carry = val / 10;
                head = head.next;
            }
        }
        while (l2 != null) {
            int val = carry + l2.val;
            if (val > 10) {
                head.next = new ListNode(val % 10);
                carry = val / 10;
                head = head.next;
            }
        }

        if (carry != 0) {
            head.next = new ListNode(carry);
        }
        return node.next;
    }

    public int helper(ListNode l1, ListNode l2, int carry) {
        var val = l1.val + l2.val + carry;
        if (val >= 10) {
            carry = val / 10;
            val = val % 10;
            head.next = new ListNode(val);
            head = head.next;
            return carry;
        } else {
            head.next = new ListNode(val);
            head = head.next;
        }
        return 0;
    }
}
