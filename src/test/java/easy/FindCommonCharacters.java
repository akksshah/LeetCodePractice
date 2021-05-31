package easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1002</p>
 * <p>Link to question: https://leetcode.com/problems/find-common-characters/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        Map<Character, Integer>[] maps = new HashMap[A.length];
        for (int i = 0 ; i < A.length ; i++) {
            maps[i] = new HashMap<>();
            for (char ch : A[i].toCharArray()) {
                maps[i].put(ch, maps[i].getOrDefault(ch, 0) + 1);
            }
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : maps[0].entrySet()) {
            char ch = entry.getKey();
            int maxValue = entry.getValue();
            for (int i = 1; i < maps.length ; i++) {
                if (!maps[i].containsKey(ch)) {
                    maxValue = 0;
                    break;
                } else {
                    maxValue = Math.min(maxValue, maps[i].get(ch));
                }
            }
            while (maxValue-- > 0) {
                result.add("" + ch);
            }
        }
        return result;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
