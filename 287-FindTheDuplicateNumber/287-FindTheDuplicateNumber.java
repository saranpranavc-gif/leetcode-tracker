// Last updated: 09/07/2026, 09:48:48
import java.util.Arrays;

class Solution {
    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }

        }

        return -1;
    }
}