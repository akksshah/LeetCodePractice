package easy;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 20</p>
 * <p>Link to question: https://leetcode.com/problems/valid-parentheses/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    Character c = stack.pop();
                    if (c != ch) {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }


    @Test
    public void test1() {
        assertTrue(new ValidParentheses().isValid("()"));
    }

    @Test
    public void test2() {
        assertFalse(new ValidParentheses().isValid("([)]"));
    }
}
