package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1108</p>
 * <p>Link to question: https://leetcode
 * .com/problems/defanging-an-ip-address/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class DefangingAnIpAddress {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
