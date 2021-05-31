package medium;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 869</p>
 * <p>Link to question: https://leetcode.com/problems/reordered-power-of-2/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ReorderPowerOf2 {
    public boolean reorderedPowerOf2(int N) {
        long c = counter(N);
        return IntStream.range(0, 32).anyMatch(i -> counter(1 << i) == c);
    }
    private long counter(int N) {
        long res = 0;
        for (; N > 0; N /= 10) {
            res += (int)Math.pow(10, N % 10);
        }
        return res;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
