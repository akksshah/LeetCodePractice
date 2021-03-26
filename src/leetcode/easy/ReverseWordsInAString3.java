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
 * <p>Leetcode question: 557</p>
 * <p>Link to question: https://leetcode
 * .com/problems/reverse-words-in-a-string-iii/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ReverseWordsInAString3 {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                stack.push(c);
            } else {
                while (!stack.isEmpty()) {
                    ans.append(stack.pop());
                }
                ans.append(' ');
            }
        }
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        return ans.toString();
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
