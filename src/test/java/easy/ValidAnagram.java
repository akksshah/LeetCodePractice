package easy;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 242</p>
 * <p>Link to question: https://leetcode.com/problems/valid-anagram </p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = stringToCharacterFrequency(s);
        Map<Character, Integer> tMap = stringToCharacterFrequency(t);
        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            if (!tMap.remove(entry.getKey(), entry.getValue())) {
                return false;
            }
        }
        return tMap.size() == 0;
    }

    private Map<Character, Integer> stringToCharacterFrequency(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    @Test
    public void test1() {
        assertTrue(new ValidAnagram().isAnagram("anagram", "nagaram"));
    }

    @Test
    public void test2() {
        assertFalse(new ValidAnagram().isAnagram("car", "cat"));
    }
}
