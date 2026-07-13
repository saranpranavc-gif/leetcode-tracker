// Last updated: 13/07/2026, 15:53:27
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left = 0;
4        int sum = 0;
5        int min = Integer.MAX_VALUE;
6
7        for (int right = 0; right < nums.length; right++) {
8            sum += nums[right];
9
10            while (sum >= target) {
11                min = Math.min(min, right - left + 1);
12                sum -= nums[left];
13                left++;
14            }
15        }
16
17        return min == Integer.MAX_VALUE ? 0 : min;
18    }
19}