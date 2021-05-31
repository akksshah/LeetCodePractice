package medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

import utility.ArrayAsString;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 870</p>
 * <p>Link to question: https://leetcode.com/problems/advantage-shuffle/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class AdvantageShuffle {
    public int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        int[] res = new int[A.length];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        IntStream.range(0, A.length).mapToObj(i -> new int[]{B[i], i}).forEach(pq::add);
        int lo = 0, hi = A.length - 1;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            res[cur[1]] = A[hi] > cur[0] ? A[hi--] : A[lo++];
        }
        return res;
    }

    @Test
    public void test1() {
        assertEquals(ArrayAsString.stringify(new int[]{2, 11, 7, 15}),
                     ArrayAsString.stringify(advantageCount(new int[]{2, 7, 11, 15},
                                    new int[]{1, 10, 4, 11})));
    }

    @Test
    public void test2() {

    }
}
