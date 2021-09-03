package medium;

import org.junit.Test;

import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.function.Function;

/**
 * <p>Leetcode question: </p>
 * <p>Link to question: </p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */

class Node {
    private static final Map<String, Function<Node, Integer>> map = Map.of(
            "+", (node) -> node.left.evaluate() + node.right.evaluate(),
            "-", (node) -> node.left.evaluate() - node.right.evaluate(),
            "*", (node) -> node.left.evaluate() * node.right.evaluate(),
            "/", (node) -> node.left.evaluate() / node.right.evaluate()
    );

    public int evaluate() {
        if (map.containsKey(val)) {
            return map.get(val).apply(this);
        }
        return Integer.parseInt(val);
    }

    public final String val;
    public Node left;
    public Node right;

    Node(String val) {
        this.val = val;
    }
}


/**
 * This is the TreeBuilder class.
 * You can treat it as the driver code that takes the postinfix input
 * and returns the expression tree represnting it as a Node.
 */

class TreeBuilder {
    Node buildTree(String[] postfix) {
        Stack<Node> stack = new Stack<>();
        Set<String> set = Set.of("+", "-", "*", "/");
        for (String token : postfix) {
            Node node = new Node(token);
            if (set.contains(token)) {
                Node node2 = stack.pop();
                node.left = stack.pop();
                node.right = node2;
            }
            stack.push(node);
        }
        return stack.pop();
    }
}

public class DesignAnExpressionTreeWithEvaluateFunction {


    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}