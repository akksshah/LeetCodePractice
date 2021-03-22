package leetcode.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import utility.TreeNode;

/**
 * <p>Leetcode question: 94</p>
 * <p>Link to question: https://leetcode.com/problems/binary-tree-inorder-traversal/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        return traverse(new ArrayList<>(), root);
    }

    public List<Integer> traverse(List<Integer> result, TreeNode root) {
        if (root == null) {
            return result;
        }
        traverse(result, root.left);
        result.add(root.val);
        traverse(result, root.right);
        return result;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
