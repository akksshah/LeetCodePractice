package random;

import org.junit.Test;

import utility.TreeNode;
import utility.ArrayAsString;
import utility.ListNode;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoinChange {
    public enum Coin {
        CENTS(1),
        NICKELS(5),
        DIMES(10),
        QUARTERS(25),
        DOLLARS(100);
        public int denom;

        Coin(int denom) {
            this.denom = denom;
        }

        public int getDenom() {
            return this.denom;
        }

        public static List<Coin> getCoins() {
            return List.of(DOLLARS, QUARTERS, DIMES, NICKELS, CENTS);
        }
    }

    public static Map<Coin, Integer> getChange(float ch) {
        int change = (int) (100 * ch);
        Map<Coin, Integer> map = new HashMap<>();
        for (Coin coin : Coin.getCoins()) {
            if (change == 0) {
                return map;
            }
            int coins = change / coin.getDenom();
                map.put(coin, coins);
            change -= coins * coin.getDenom();
        }
        if (change != 0) { // you will only hit this, if you have limited coins. So you will have to modify accordingly
            throw new RuntimeException("Change cannot be provided");
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(getChange(1.25f));
        System.out.println(getChange(0.3f));
    }

    @Test
    public void test() {
        System.out.println(getChange(1.25f));
        System.out.println(getChange(0.3f));
    }
}
