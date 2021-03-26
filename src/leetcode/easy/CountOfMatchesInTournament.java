package leetcode.easy;

import org.junit.Test;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1688</p>
 * <p>Link to question: https://leetcode
 * .com/problems/count-of-matches-in-tournament/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class CountOfMatchesInTournament {
    public int numberOfMatches(int n) {
        if (n < 2) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return n / 2 + numberOfMatches((n + 1) / 2);
        }
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
