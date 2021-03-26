package leetcode.easy;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 804</p>
 * <p>Link to question: https://leetcode.com/problems/unique-morse-code-words/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] c = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> s = new HashSet<>();
        for (String word : words) {
            StringBuilder a = new StringBuilder();
            for (char ch : word.toCharArray()) {
                a.append(c[ch - 'a']);
            }
            s.add(a.toString());
        }
        return s.size();
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
