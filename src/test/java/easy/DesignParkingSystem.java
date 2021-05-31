package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * <p>Leetcode question: 1603</p>
 * <p>Link to question: https://leetcode.com/problems/design-parking-system/</p>
 * <p>Link to solution: My solution</p>
 * <p>Link to preferred solution: </p>
 */
public class DesignParkingSystem {
    public class ParkingSystem {
        private int big;
        private int small;
        private int medium;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            return switch (carType) {
                case 1 -> big-- > 0;
                case 2 -> medium-- > 0;
                case 3 -> small-- > 0;
                default -> false;
            };
        }
    }

    /**
     * Your ParkingSystem object will be instantiated and called as such:
     * ParkingSystem obj = new ParkingSystem(big, medium, small);
     * boolean param_1 = obj.addCar(carType);
     */

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }
}
