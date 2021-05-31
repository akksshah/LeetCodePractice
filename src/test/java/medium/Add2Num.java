package medium;

import utility.ListNode;

/**
 * <p>Leetcode question: 2</p>
 * <p>Link to question: https://leetcode.com/problems/add-two-numbers/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
class Add2Num {
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
