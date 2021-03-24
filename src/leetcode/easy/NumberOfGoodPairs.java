package leetcode.easy;

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
 * <p>Leetcode question: 1512</p>
 * <p>Link to question: https://leetcode.com/problems/number-of-good-pairs/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++) {
            if (map.containsKey(nums[i])) {
                pairs += map.get(nums[i]);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return pairs;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
