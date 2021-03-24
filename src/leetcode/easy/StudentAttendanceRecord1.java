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
 * <p>Leetcode question: 551</p>
 * <p>Link to question: https://leetcode.com/problems/student-attendance-record-i/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class StudentAttendanceRecord1 {
    public boolean checkRecord(String s) {
        int late = 3;
        int absent = 2;
        char[] charArray = s.toCharArray();
        for (int i = 0, charArrayLength = charArray.length ; i < charArrayLength ; i++) {
            char ch = charArray[i];
            switch (ch) {
                case 'A' -> {
                    if (late != 3) {
                        late = 3;
                    }
                    absent--;
                }
                case 'L' -> late--;
                default -> late = 3;
            }
            if (late == 0 || absent == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
