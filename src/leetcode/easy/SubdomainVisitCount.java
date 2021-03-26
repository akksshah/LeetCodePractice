package leetcode.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 811</p>
 * <p>Link to question: https://leetcode.com/problems/subdomain-visit-count/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counts = new HashMap<>();
        for (String domain : cpdomains) {
            String[] c = domain.split(" ");
            int count = Integer.parseInt(c[0]);
            String domains = c[1];
            while (domains.contains(".")) {
                counts.put(domains, counts.getOrDefault(domains, 0) + count);
                domains = domains.substring(domains.indexOf('.') + 1);
            }
            counts.put(domains, counts.getOrDefault(domains, 0) + count);
        }
        return counts.entrySet().stream().map(entry -> entry.getValue() + " " + entry.getKey()).collect(Collectors.toList());
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
