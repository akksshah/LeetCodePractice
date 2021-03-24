package leetcode.easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 217</p>
 * <p>Link to question: https://leetcode.com/problems/contains-duplicate/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.toSet()).size() != nums.length;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
