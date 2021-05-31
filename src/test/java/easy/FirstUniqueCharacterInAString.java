package easy;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 387</p>
 * <p>Link to question: https://leetcode
 * .com/problems/first-unique-character-in-a-string/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return IntStream.range(0, s.length()).filter(i -> map.get(s.charAt(i)) == 1).findFirst().orElse(-1);
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
