package easy;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 155</p>
 * <p>Link to question: https://leetcode.com/problems/min-stack/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class MinStack {
    private final Stack<Integer> stack;
    private final PriorityQueue<Integer> min;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        min = new PriorityQueue<>();
    }

    public void push(int val) {
        stack.push(val);
        min.offer(val);
    }

    public void pop() {
        min.remove(stack.pop());
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }


    /**
     * Your MinStack object will be instantiated and called as such: MinStack
     * obj = new MinStack(); obj.push(val); obj.pop(); int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
