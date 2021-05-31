package easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * <p>Leetcode question: 412</p>
 * <p>Link to question: https://leetcode.com/problems/fizz-buzz/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1 ; i <= n ; i++) {
            String s = i % 3 == 0 ? "Fizz" : "";
            s += i % 5 == 0 ? "Buzz" : "";
            s += s.equals("") ? i : "";
            result.add(s);
        }
        return result;
    }

    public List<String> fizzBuzzWithoutModulo(int n) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int fizz = 0;
        int buzz = 0;
        while (++i <= n) {
            fizz++;
            buzz++;
            if (fizz == 3 && buzz == 5) {
                result.add("FizzBuzz");
                fizz = 0;
                buzz = 0;
            } else if (fizz == 3) {
                result.add("Fizz");
                fizz = 0;
            } else if (buzz == 5) {
                result.add("Buzz");
                buzz = 0;
            } else {
                result.add("" + i);
            }
        }
        return result;
    }

    @Test
    public void test1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(fizzBuzz.fizzBuzz(15), fizzBuzz.fizzBuzzWithoutModulo(15));
    }

    @Test
    public void test2() {

    }
}
