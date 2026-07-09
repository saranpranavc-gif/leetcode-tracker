// Last updated: 09/07/2026, 09:45:37
import java.util.*;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 2) {
                res.add(entry.getKey());
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}