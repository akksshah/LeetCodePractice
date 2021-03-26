package leetcode.easy;

import org.junit.Test;

import java.util.Arrays;
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
 * <p>Leetcode question: 1460</p>
 * <p>Link to question: https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class MakeTwoArraysEqualByReversingSubArrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> targetSet = new HashMap<>();
        Arrays.stream(target).forEach(i -> targetSet.put(i, targetSet.getOrDefault(i, 0) + 1));
        for (int i : arr) {
            if(!targetSet.containsKey(i)) {
                return false;
            } else {
                targetSet.put(i, targetSet.get(i) - 1);
                if (targetSet.get(i) == 0) {
                    targetSet.remove(i);
                }
            }
        }
        return targetSet.size() == 0;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
