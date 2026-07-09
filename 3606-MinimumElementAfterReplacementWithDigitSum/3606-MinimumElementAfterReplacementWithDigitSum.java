// Last updated: 09/07/2026, 09:45:33
class Solution {
    public int minElement(int[] nums) {

        int ans = Integer.MAX_VALUE;

        for (int num : nums) {
            ans = Math.min(ans, digitSum(num));
        }

        return ans;
    }

    private int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}