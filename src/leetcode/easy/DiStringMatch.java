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
 * <p>Leetcode question: 942</p>
 * <p>Link to question: https://leetcode.com/problems/di-string-match/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class DiStringMatch {
    public int[] diStringMatch(String S) {
        int minValue = 0;
        int maxValue = S.length();
        int[] ans = new int[S.length() + 1];
        for (int i = 0 ; i < S.length() ; i++) {
            ans[i] = S.charAt(i) == 'I' ? minValue++ : maxValue--;
        }
        ans[ans.length - 1] = S.charAt(S.length() - 1) == 'I' ? minValue : maxValue;
        return ans;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
