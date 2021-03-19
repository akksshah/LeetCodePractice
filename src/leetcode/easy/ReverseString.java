package leetcode.easy;

import org.junit.Test;

/**
 * <p>Leetcode question: 344</p>
 * <p>Link to question: https://www.leetcode.com/problems/reverse-string/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0 ; i < s.length / 2 ; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
