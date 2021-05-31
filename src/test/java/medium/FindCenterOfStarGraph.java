package medium;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1791</p>
 * <p>Link to question: https://leetcode
 * .com/problems/find-center-of-star-graph/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class FindCenterOfStarGraph {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] edge : edges) {
            map.put(edge[0], map.getOrDefault(edge[0], 0) + 1);
            map.put(edge[1], map.getOrDefault(edge[1], 0) + 1);
        }
        return map.entrySet().stream().filter(entry -> entry.getValue() == edges.length).findFirst().map(Map.Entry::getKey).orElse(-1);
    }

    @Test
    public void test1() {
        int[][] e = new int[][]{{1, 2}, {2, 3}, {4, 2}};
        assertEquals(2, findCenter(e));
    }

    @Test
    public void test2() {
        int[][] e = new int[][]{{1, 2}, {5, 1}, {1, 3}, {1, 4}};
        assertEquals(1, findCenter(e));
    }
}
