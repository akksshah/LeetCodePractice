package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 709</p>
 * <p>Link to question: https://leetcode.com/problems/to-lower-case/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class ToLowerCase {
    public String toLowerCase(String str) {
        StringBuilder s = new StringBuilder();
        for (int i = 0 ; i < str.length() ; i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                s.append((char)(c + 32));
            } else {
                s.append(c);
            }
        }
        return s.toString();
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
