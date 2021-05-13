package leetcode.easy;

import org.junit.Test;

/**
 * <p>Leetcode question: 326</p>
 * <p>Link to question: https://leetcode.com/problems/power-of-three/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
