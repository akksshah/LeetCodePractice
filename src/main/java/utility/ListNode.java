package utility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Definition for singly-linked list.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListNode {
    public int val;

    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    @Override
    public String toString() {
        var nextCopy = this.next;
        var stringBuilder = new StringBuilder(String.valueOf(val));
        while (nextCopy != null) {
            stringBuilder.append(" -> ").append(nextCopy.val);
            nextCopy = nextCopy.next;
        }
        return stringBuilder.toString();
    }
}
