package easy;

import org.junit.Test;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import java.util.Stack;

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
public class MaxStack {
    Stack<Integer> s;
    Stack<Integer> max;

    /**
     * initialize your data structure here.
     */
    public MaxStack() {
        s = new Stack<>();
        max = new Stack<>();
    }

    public void push(int x) {
        s.push(x);
        if (max.isEmpty() || max.peek() <= x) {
            max.push(x);
        }
    }

    public int pop() {
        int val = s.pop();
        if (!max.isEmpty() && max.peek() == val) {
            max.pop();
        }
        return val;
    }

    public int top() {
        return s.peek();
    }

    public int peekMax() {
        return max.peek();
    }

    public int popMax() {
        Stack<Integer> st = new Stack<>();
        int max = this.peekMax();
        while (!s.isEmpty()) {
            st.push(this.pop());
        }
        boolean removed = false;
        while (!st.isEmpty()) {
            int val = st.pop();
            if (!removed && val == max) {
                removed = true;
                continue;
            }
            this.push(val);
        }
        return max;
    }

    @Test
    public void test1() {
        MaxStack maxStack = new MaxStack();
        maxStack.push(5);
        maxStack.push(1);
        maxStack.popMax();
        maxStack.peekMax();
    }

    @Test
    public void test2() {

    }
}