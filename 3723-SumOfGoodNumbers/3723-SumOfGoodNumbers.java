// Last updated: 09/07/2026, 09:45:29
class Solution {

    public int sumOfGoodNumbers(int[] nums, int k) {

        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            boolean left = (i - k < 0) ||
                           (nums[i] > nums[i - k]);

            boolean right = (i + k >= n) ||
                            (nums[i] > nums[i + k]);

            if (left && right) {
                sum += nums[i];
            }
        }

        return sum;
    }
}