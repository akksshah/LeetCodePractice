package medium;

import org.junit.Test;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: </p>
 * <p>Link to question: </p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<int[], List<String>> map = new HashMap<>();
        for (String s: strs) {
            int[] counts = getCountOfCharacters(s);
            List<String> list = map.getOrDefault(counts, new ArrayList<>());
            list.add(s);
            map.put(counts, list);
        }
        return new ArrayList<>(map.values());
    }

    private int[] getCountOfCharacters(String s) {
        int[] counts = new int[26];
        for (char ch : s.toCharArray()) {
            counts[ch - 'a']++;
        }
        return counts;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}