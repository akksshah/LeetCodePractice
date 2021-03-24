package leetcode.easy;

import org.junit.Test;

import java.util.Stack;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1614</p>
 * <p>Link to question: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int max = 0;
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                max = Math.max(max, st.size());
                st.pop();
            }
        }
        return max;
    }

    @Test
    public void test1() {
        assertEquals(3, maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    @Test
    public void test2() {
        assertEquals(3, maxDepth("(1)+((2))+(((3)))"));
    }

    @Test
    public void test3() {
        assertEquals(1, maxDepth("1+(2*3)/(2-1)"));
    }

    @Test
    public void test4() {
        assertEquals(0, maxDepth("1"));
    }
}
