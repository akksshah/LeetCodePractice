package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 916</p>
 * <p>Link to question: https://leetcode.com/problems/word-subsets/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class WordSubsets {

    public List<String> wordSubsets(String[] A, String[] B) {
        int[] bmax = count("");
        Arrays.stream(B).map(this::count)
                .forEach(bCount ->
                                 IntStream.range(0, 26)
                                         .forEach(i -> bmax[i]
                                                               = Math.max(bmax[i], bCount[i])));

        List<String> ans = new ArrayList<>();
        search:
        for (String a : A) {
            int[] aCount = count(a);
            for (int i = 0 ; i < 26 ; ++i) {
                if (aCount[i] < bmax[i]) {
                    continue search;
                }
            }
            ans.add(a);
        }
        return ans;
    }

    public int[] count(String S) {
        int[] ans = new int[26];
        for (char c : S.toCharArray()) {
            ans[c - 'a']++;
        }
        return ans;
    }


    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
