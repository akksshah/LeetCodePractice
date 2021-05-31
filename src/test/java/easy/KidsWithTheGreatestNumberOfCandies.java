package easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1431</p>
 * <p>Link to question: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i : candies) {
            max = Math.max(max, i);
        }
        List<Boolean> list = new ArrayList<>();
        for (int i : candies) {
            list.add(extraCandies + i >= max);
        }
        return list;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
