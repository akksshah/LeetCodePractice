package easy;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1313</p>
 * <p>Link to question: https://leetcode.com/problems/decompress-run-length-encoded-list/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int s = IntStream.iterate(0, i -> i < nums.length, i -> i + 2).map(i -> nums[i]).sum();
        int[] res = new int[s];
        for (int i = 0, j = 0 ; i < nums.length ; i += 2) {
            while (nums[i]-- > 0) {
                res[j++] = nums[i + 1];
            }
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
