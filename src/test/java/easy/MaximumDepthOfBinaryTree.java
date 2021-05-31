package easy;

import org.junit.Test;

import utility.TreeNode;

/**
 * <p>Leetcode question: 104</p>
 * <p>Link to question: https://www.leetcode
 * .com/problems/maximum-depth-of-binary-tree/
 * </p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return maxDepth(root, 0);
    }

    public int maxDepth(TreeNode root, int height) {
        return root == null
               ? height
               : Math.max(maxDepth(root.left, height + 1),
                          maxDepth(root.right, height + 1));
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
