// Last updated: 09/07/2026, 09:46:58
class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] res = new int[2 * n];

        int i = 0; // first half
        int j = n; // second half
        int k = 0;

        while (k < 2 * n) {

            res[k++] = nums[i++];
            res[k++] = nums[j++];
        }

        return res;
    }
}