package leetcode.easy;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 122</p>
 * <p>Link to question: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        return IntStream.range(1, prices.length).filter(i -> prices[i] > prices[i - 1]).map(i -> (prices[i] - prices[i - 1])).sum();
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
