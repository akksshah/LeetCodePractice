package easy;

import org.junit.Test;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import java.util.Map;

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
public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        Map<Character, int[]> map = Map.of(
                'R', new int[]{1, 0},
                'L', new int[]{-1, 0},
                'U', new int[]{0, 1},
                'D', new int[]{0, -1}
        );
        int[] ans = new int[]{0, 0};
        for (char c : moves.toCharArray()) {
            ans[0] += map.get(c)[0];
            ans[1] += map.get(c)[1];
        }
        return ans[0] == 0 && ans[1] == 0;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}