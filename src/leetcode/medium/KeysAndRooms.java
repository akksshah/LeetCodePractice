package leetcode.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Leetcode question: 841
 * Link to question: https://leetcode.com/problems/keys-and-rooms/
 * Link to solution: My solution
 * Link to preferred solution
 * Tag: medium
 */
public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visitedRooms = new HashSet<>();
        queue.offer(0);
        while (!queue.isEmpty()) {
            int roomToVisit = queue.poll();
            visitedRooms.add(roomToVisit);
            List<Integer> keysInRoom = rooms.get(roomToVisit);
            for (int i : keysInRoom) {
                if (!visitedRooms.contains(i)) {
                    queue.offer(i);
                }
            }
        }
        return visitedRooms.size() == rooms.size();
    }

    @Test
    public void test1() {
        KeysAndRooms obj = new KeysAndRooms();
        String strings = "[[1],[2],[3],[]]"; // demo input
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        List<Integer> three = new ArrayList<>();
        zero.add(1);
        one.add(2);
        two.add(3);
        lists.add(zero);
        lists.add(one);
        lists.add(two);
        lists.add(three);
        assertTrue(obj.canVisitAllRooms(lists));
    }

    @Test
    public void test2() {
        KeysAndRooms obj = new KeysAndRooms();
        String strings = "[[1,3],[3,0,1],[2],[0]]"; // demo input
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        List<Integer> three = new ArrayList<>();
        zero.add(1);
        zero.add(3);
        one.add(3);
        one.add(0);
        one.add(1);
        two.add(2);
        three.add(0);
        lists.add(zero);
        lists.add(one);
        lists.add(two);
        lists.add(three);
        assertFalse(obj.canVisitAllRooms(lists));
    }
}
