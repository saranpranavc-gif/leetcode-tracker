// Last updated: 09/07/2026, 09:45:35
import java.util.*;

class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {

        List<Integer> res = new ArrayList<>();

        for (int i = 1; i < height.length; i++) {

            if (height[i - 1] > threshold) {
                res.add(i);
            }
        }

        return res;
    }
}