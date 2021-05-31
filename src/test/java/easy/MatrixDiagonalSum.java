package easy;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1572</p>
 * <p>Link to question: https://leetcode.com/problems/matrix-diagonal-sum/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = IntStream.range(0, mat.length).map(i -> mat[i][i] + mat[i][mat.length - i - 1]).sum();
        if (mat.length % 2 == 1) {
            sum -= mat[mat.length / 2][mat.length / 2];
        }
        return sum;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
