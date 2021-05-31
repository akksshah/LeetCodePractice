package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 665</p>
 * <p>Link to question: https://leetcode.com/problems/non-decreasing-array/</p>
 * <p>Link to solution: LC Solution</p>
 * <p>Link to preferred solution: LC Solution</p>
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

    public boolean LCCheckPossibility(int[] nums) {

        int numViolations = 0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] > nums[i]) {

                if (numViolations == 1) {
                    return false;
                }

                numViolations++;

                if (i < 2 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
        }

        return true;
    }

    @Test
    public void test1() {
        assertFalse(LCCheckPossibility(new int[]{3, 4, 2, 3}));
    }

    @Test
    public void test2() {

    }
}
