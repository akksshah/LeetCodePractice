package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1732</p>
 * <p>Link to question: https://leetcode.com/problems/find-the-highest-altitude/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;
        for (int a : gain) {
            current += a;
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
