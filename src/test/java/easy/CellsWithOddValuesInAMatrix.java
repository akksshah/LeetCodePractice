package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1252</p>
 * <p>Link to question: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class CellsWithOddValuesInAMatrix {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] a = new int[m][n];
        for (int[] index : indices) {
            for (int j = 0 ; j < n ; j++) {
                a[index[0]][j]++;
            }
            for (int j = 0 ; j < m ; j++) {
                a[j][index[1]]++;
            }
        }
        int c = 0;
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                // System.out.print(a[i][j] + " ");
                if (a[i][j] % 2 == 1) {
                    c++;
                }
            }
            // System.out.println();
        }
        return c;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
