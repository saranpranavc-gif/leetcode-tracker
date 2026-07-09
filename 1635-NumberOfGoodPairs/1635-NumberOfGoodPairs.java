// Last updated: 09/07/2026, 09:46:51
class Solution {
    public int numIdenticalPairs(int[] nums) {

        int[] freq = new int[101];
        int count = 0;

        for (int num : nums) {
            count += freq[num];
            freq[num]++;
        }

        return count;
    }
}