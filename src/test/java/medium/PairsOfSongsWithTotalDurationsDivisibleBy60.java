package medium;

import org.junit.Test;

/**
 * <p>Leetcode question: </p>
 * <p>Link to question: </p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class PairsOfSongsWithTotalDurationsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        int[] remainders = new int[60];
        int count = 0;
        for (int t : time) {
            // check if a%60==0 && b%60==0
            // check if a%60+b%60==60
            count += t % 60 == 0 ? remainders[0] : remainders[60 - t % 60];
            remainders[t % 60]++; // remember to update the remainders
        }
        return count;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}