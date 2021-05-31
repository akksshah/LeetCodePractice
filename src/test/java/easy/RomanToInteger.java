package easy;

import org.junit.Test;

import java.util.Map;
import java.util.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 13</p>
 * <p>Link to question: https://leetcode.com/problems/roman-to-integer/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        Stack<Character> stack = new Stack<>();
        int result = 0;
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else if (map.get(stack.peek()) >= map.get(ch)) {
                stack.push(ch);
            } else {
                while (!stack.isEmpty() && map.get(stack.peek()) < map.get(ch)) {
                    result -= map.get(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            result += map.get(stack.pop());
        }
        return result;
    }

    public int romanToInt2(String s) {
        int sum = 0;

        int n = s.length();
        for (int i = n - 1 ; i >= 0 ; i--) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'I':
                    sum += sum >= 5 ? -1 : 1;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    sum += sum >= 50 ? -10 : 10;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    sum += sum >= 500 ? -100 : 100;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }

        return sum;
    }

    @Test
    public void test1() {
        assertEquals(1994, romanToInt("MCMXCIV"));
        assertEquals(9, romanToInt("IX"));
    }

    @Test
    public void test2() {

    }
}
