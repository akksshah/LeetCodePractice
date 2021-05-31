package easy;

import org.junit.Test;

import utility.TreeNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 101</p>
 * <p>Link to question: https://leetcode.com/problems/symmetric-tree/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        else return helper(root.left, root.right);
    }
    private boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else {
            return left.val == right.val && helper(left.right, right.left) && helper(left.left, right.right);
        }
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
