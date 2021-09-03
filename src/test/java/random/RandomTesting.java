package random;
import org.junit.Test;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: </p>
 * <p>Link to question: </p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class RandomTesting {
    public static void testMethod(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        List<Integer> inputIntList = Arrays.asList(1, 12, 3, 4, 5, 6, 7, 9, 10);
        intStack.addAll(inputIntList);

        List<Integer> filtered = intStack
                .stream()
                .filter(element -> element % 3 == 0)
                .collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }

    public static void main(String[] args) {
        testMethod2();
    }

    public static void testMethod2() {
        String line = "1a2b3c4d5e11f4h20i10d";
        String pattern = "(\\d+)(\\w)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        StringBuilder s = new StringBuilder();
        while (m.find()) {
            s.append(m.group(2).repeat(Math.max(0, Integer.parseInt(m.group(1)))));
            System.out.print("Found value: " + m.group(1) );
            System.out.print("\t Found value: " + m.group(2) );
            System.out.println();
        }
        System.out.println(s.toString());
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}