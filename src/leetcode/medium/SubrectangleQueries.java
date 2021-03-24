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
 * <p>Leetcode question: 1476</p>
 * <p>Link to question: https://leetcode.com/problems/subrectangle-queries/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class SubrectangleQueries {
    private int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2,
                                   int newValue) {
        if (row1 < 0 || row2 >= rectangle.length || col1 < 0 || col2 > rectangle[0].length || row1 > row2 || col1 > col2) {
            return;
        }
        for (int i = row1 ; i <= row2 ; i++) {
            for (int j = col1 ; j <= col2 ; j++) {
                this.rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }


    /**
     * Your SubrectangleQueries object will be instantiated and called as such:
     * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
     * obj.updateSubrectangle(row1,col1,row2,col2,newValue); int param_2 =
     * obj.getValue(row,col);
     */

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
