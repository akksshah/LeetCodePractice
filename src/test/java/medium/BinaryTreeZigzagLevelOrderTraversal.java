package medium;

import org.junit.Test;

import utility.TreeNode;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

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
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean rev = false;
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int s = queue.size();
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < s; i++) {
                TreeNode r = queue.poll();
                row.add(r.val);
                if (r.left != null) {
                    queue.add(r.left);
                }
                if (r.right != null) {
                    queue.add(r.right);
                }
            }
            if (rev) {
                Collections.reverse(row);
            }
            rev = !rev;
            res.add(row);
        }
        return res;
    }

    @Test
    public void test1() {
        List<List<Integer>> ans = zigzagLevelOrder(TreeNode.insertLevelOrder(new Integer[]{3,9,20,null,null,15,7}, new TreeNode(), 0));
        List<List<Integer>> l = new ArrayList<>();
        l.add(new ArrayList<>(Collections.singletonList(3)));
        l.add(new ArrayList<>(Arrays.asList(20, 9)));
        l.add(new ArrayList<>(Arrays.asList(15, 7)));
        assertEquals(l, ans);
        // System.out.println(Arrays.binarySearch(new int[]{1, 3, 5, 7}, 8));
        // System.out.println(Arrays.deepToString(new Object[]{1, 3, 5, 7}));
    }

    @Test
    public void test2() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = integers.stream().reduce(0, Integer::sum);
    }
}