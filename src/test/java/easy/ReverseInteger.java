package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 7</p>
 * <p>Link to question: https://leetcode.com/problems/reverse-integer/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ReverseInteger {
    public int reverse(int x) {
        int copy = x;
        int result = 0;
        while (x != 0) {
            result *= 10;
            result += x % 10;
            x /= 10;
        }
        if ((result > 0 && copy > 0) || (result < 0 && copy < 0)) {
            return result;
        }
        return 0;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
