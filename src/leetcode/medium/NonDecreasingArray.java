package leetcode.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 665</p>
 * <p>Link to question: https://leetcode.com/problems/non-decreasing-array/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.offer(nums[0]);
        for (int i = 1 ; i < nums.length ; i++) {
            if (nums[i - 1] > nums[i]) {
//                count++;
            } else if (pq.peek() < nums[i]) {
                List<Integer> s = new ArrayList<>();
                while (!pq.isEmpty() && pq.peek() > nums[i]) {
                    count++;
                    s.add(pq.poll());
                }
                pq.offer(nums[i]);
                for (int t : s) {
                    pq.offer(t);
                }
            }
        }
        return count <= 1;
    }

    @Test
    public void test1() {
        assertFalse(checkPossibility(new int[]{3, 4, 2, 3}));
    }

    @Test
    public void test2() {

    }
}
