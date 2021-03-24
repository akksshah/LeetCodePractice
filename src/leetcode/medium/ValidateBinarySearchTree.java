package leetcode.medium;

import org.junit.Test;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 98</p>
 * <p>Link to question: https://leetcode
 * .com/problems/validate-binary-search-tree/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    public boolean isValid(TreeNode root, Integer minValue, Integer maxValue) {
        boolean result = true;
        if (root == null) {
            return true;
        }
        if (minValue != null) {
            result = root.val > minValue;
        }
        if (maxValue != null) {
            result = result && root.val < maxValue;
        }
        if (root.left == null && root.right == null) {
            return result;
        } else if (root.left == null) {
            result = result && isValid(root.right, root.val, maxValue);
        } else if (root.right == null) {
            result = result && isValid(root.left, minValue, root.val);
        } else {
            result = result
                             && isValid(root.left, minValue, root.val)
                             && isValid(root.right, root.val, maxValue);
        }
        return result;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
