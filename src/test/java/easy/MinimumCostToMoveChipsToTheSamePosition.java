package easy;

public class MinimumCostToMoveChipsToTheSamePosition {
    public int minCostToMoveChips(int[] position) {
        int min = 0 ; int max = 0;
        for (int pos : position) {
            if (pos % 2 == 0) {
                min++;
            } else {
                max++;
            }
        }
        return Math.min(min, max);
    }
}
