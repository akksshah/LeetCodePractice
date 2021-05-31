package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1678</p>
 * <p>Link to question: https://leetcode.com/problems/goal-parser-interpretation/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class GoalParserInterpretation {
    public String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }

    @Test
    public void test1() {
        assertEquals("Goal", interpret("G()(al)"));
        assertEquals("Gooooal", interpret("G()()()()(al)"));
        assertEquals("alGalooG", interpret("(al)G(al)()()G"));
    }

    @Test
    public void test2() {

    }
}
