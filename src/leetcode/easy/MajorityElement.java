package leetcode.easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 169</p>
 * <p>Link to question: https://leetcode.com/problems/majority-element/submissions/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEachOrdered(num -> map.put(num, map.getOrDefault(num, 0) + 1));
        int val = nums[0];
        int count = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                val = entry.getKey();
            }
            if (entry.getValue() == count) {
                val = Math.max(val, entry.getKey());
            }
            if (count > nums.length / 2) {
                return entry.getKey();
            }
        }
        return val;
    }

    @Test
    public void test1() {
        MajorityElement majorityElement = new MajorityElement();
        assertEquals(3, majorityElement.majorityElement(new int[]{3, 3, 4}));
    }

    @Test
    public void test2() {

    }
}
