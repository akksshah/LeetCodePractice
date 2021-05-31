package easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 118</p>
 * <p>Link to question: https://leetcode.com/problems/pascals-triangle/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows < 1) {
            return ans;
        }
        List<Integer> zero = new ArrayList<>();
        zero.add(1);
        ans.add(zero);
        for (int i = 1 ; i < numRows ; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < ans.get(i - 1).size() ; j++) {
                row.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
            }
            row.add(1);
            ans.add(row);
        }
        return ans;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
