// Last updated: 09/07/2026, 09:47:14
import java.util.*;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {

        Arrays.sort(nums);

        int total = 0;
        for (int n : nums) total += n;

        List<Integer> res = new ArrayList<>();
        int sum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {

            sum += nums[i];
            res.add(nums[i]);

            if (sum > total - sum) break;
        }

        return res;
    }
}