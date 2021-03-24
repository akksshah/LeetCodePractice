package leetcode.medium;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 220</p>
 * <p>Link to question: https://leetcode
 * .com/problems/contains-duplicate-iii/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ContainsDuplicate3 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    if (Math.abs(nums[map.get(nums[i])] - nums[i]) <= t) {
                        return true;
                    }
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
