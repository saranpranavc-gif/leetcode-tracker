// Last updated: 09/07/2026, 09:48:23
import java.util.*;

class Solution {
    public int distributeCandies(int[] candyType) {

        Set<Integer> set = new HashSet<>();

        for (int c : candyType) {
            set.add(c);
        }

        int maxTypes = candyType.length / 2;

        return Math.min(set.size(), maxTypes);
    }
}