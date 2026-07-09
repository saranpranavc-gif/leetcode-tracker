// Last updated: 09/07/2026, 09:48:55
import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int limit = nums.length / 3;

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }

            }

            if (count > limit && !ans.contains(nums[i])) {
                ans.add(nums[i]);
            }

        }

        return ans;
    }
}