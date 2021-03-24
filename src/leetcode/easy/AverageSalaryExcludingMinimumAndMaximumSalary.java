package leetcode.easy;

import org.junit.Test;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1491</p>
 * <p>Link to question: https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class AverageSalaryExcludingMinimumAndMaximumSalary {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        if (salary.length < 2) {
            return 0;
        }
        int total = salary[0];
        for (int i = 1 ; i < salary.length ; i++) {
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
            total += salary[i];
        }
        return 1.0 * (total - min - max) / (salary.length - 2);
    }

    @Test
    public void test1() {
        assertEquals(2500, average(new int[]{4000, 3000, 1000, 2000}),
                     0.000000000001);
        assertEquals(3500, average(new int[]{6000, 5000, 4000, 3000, 1000,
                             2000}),
                     0.000000000001);
    }

    @Test
    public void test2() {
        assertEquals(2000, average(new int[]{3000, 1000, 2000}),
                     0.000000000001);
        assertEquals(4750,
                     average(new int[]{8000, 9000, 6000, 3000, 1000, 2000}),
                     0.000000000001);
    }
}
