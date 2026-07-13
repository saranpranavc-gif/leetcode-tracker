// Last updated: 13/07/2026, 17:05:05
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        boolean[] present = new boolean[nums.length + 1];
4
5        for (int i = 0; i < nums.length; i++) {
6            present[nums[i]] = true;
7        }
8
9        List<Integer> ans = new ArrayList<>();
10
11        for (int i = 1; i <= nums.length; i++) {
12            if (!present[i]) {
13                ans.add(i);
14            }
15        }
16
17        return ans;
18    }
19}