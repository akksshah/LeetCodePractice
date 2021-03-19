package leetcode.medium;

import org.junit.Test;

import java.sql.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

import Utility.ArrayAsString;

import static org.junit.Assert.assertEquals;

public class MinimumNumberofOperationstoMoveAllBallstoEachBox {
    public int[] minOperations(String boxes) {
        int[] left = new int[boxes.length()];
        int count = boxes.charAt(0) - '0';
        for (int i = 1 ; i < boxes.length() ; i++) {
            left[i] = left[i - 1] + count;
            count += boxes.charAt(i) - '0';
        }
        int[] right = new int[boxes.length()];
        count = boxes.charAt(boxes.length() - 1) - '0';
        for (int i = boxes.length() - 2 ; i >=0 ; i--) {
            right[i] = right[i + 1] + count;
            count += boxes.charAt(i) - '0';
        }
        int[] ans = new int[boxes.length()];
        for (int i = 0 ; i < boxes.length() ; i++) {
            ans[i] = left[i] + right[i];
        }
        return ans;
    }

    @Test
    public void test1() {
        MinimumNumberofOperationstoMoveAllBallstoEachBox obj = new MinimumNumberofOperationstoMoveAllBallstoEachBox();
        assertEquals(ArrayAsString.stringify(new int[]{1, 1, 3}), ArrayAsString.stringify(obj.minOperations("110")));
    }

    @Test
    public void test2() {
        MinimumNumberofOperationstoMoveAllBallstoEachBox obj = new MinimumNumberofOperationstoMoveAllBallstoEachBox();
        assertEquals(ArrayAsString.stringify(new int[]{11, 8, 5, 4, 3, 4}), ArrayAsString.stringify(obj.minOperations("001011")));
    }
}
