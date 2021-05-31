package easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>Leetcode question: 136</p>
 * <p>Link to question: https://www.leetcode.com/problems/single-number/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public int singleNumber2(int[] nums) {
        Set<Integer> singleElement = new HashSet<>();
        for (int num : nums) {
            if (singleElement.contains(num)) {
                singleElement.remove(num);
            } else {
                singleElement.add(num);
            }
        }
        return (int) singleElement.toArray()[0];
    }

    int singleNumber3(int[] nums) {
        return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
    }

    int singleNumber4(int[] nums) {
        // fastest
        int acc = 0;
        for (int num : nums) {
            acc = acc ^ num;
        }
        return acc;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
