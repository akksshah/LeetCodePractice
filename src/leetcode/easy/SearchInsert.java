package leetcode.easy;

import java.util.Arrays;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int val = Arrays.binarySearch(nums, target);
        return val >= 0 ? val : -1 * (val + 1);
    }
}
