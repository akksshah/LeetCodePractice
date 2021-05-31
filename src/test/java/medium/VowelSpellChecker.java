package medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 966</p>
 * <p>Link to question: https://leetcode.com/problems/vowel-spellchecker/ </p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class VowelSpellChecker {
    Set<String> words_perfect = new HashSet<>();
    Map<String, String> words_cap = new HashMap<>();
    Map<String, String> words_vow = new HashMap<>();

    public String[] spellchecker(String[] wordlist, String[] queries) {
        Arrays.stream(wordlist).forEach(word -> {
            words_perfect.add(word);
            String wordInLowerCase = word.toLowerCase();
            words_cap.putIfAbsent(wordInLowerCase, word);
            words_vow.putIfAbsent(deVowel(wordInLowerCase), word);
        });

        String[] ans = new String[queries.length];
        int t = 0;
        for (String query : queries) {
            ans[t++] = solve(query);
        }
        return ans;
    }

    public String solve(String query) {
        if (words_perfect.contains(query)) {
            return query;
        }
        String queryL = query.toLowerCase();
        if (words_cap.containsKey(queryL)) {
            return words_cap.get(queryL);
        }

        String queryLV = deVowel(queryL);
        if (words_vow.containsKey(queryLV)) {
            return words_vow.get(queryLV);
        }

        return "";
    }

    public String deVowel(String word) {
        StringBuilder ans = new StringBuilder();
        for (char c : word.toCharArray()) {
            ans.append(isVowel(c) ? '*' : c);
        }
        return ans.toString();
    }

    public boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
