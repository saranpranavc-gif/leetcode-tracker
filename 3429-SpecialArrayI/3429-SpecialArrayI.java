// Last updated: 09/07/2026, 09:45:54
class Solution {
    public boolean isArraySpecial(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            if ((nums[i] % 2) == (nums[i - 1] % 2)) {
                return false;
            }
        }

        return true;
    }
}