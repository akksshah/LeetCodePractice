package leetcode.easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1207</p>
 * <p>Link to question: https://leetcode.com/problems/unique-number-of-occurrences/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(arr).forEach(num -> map.put(num, map.getOrDefault(num, 0) + 1));
        return map.size() == new HashSet<>(map.values()).size();
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
