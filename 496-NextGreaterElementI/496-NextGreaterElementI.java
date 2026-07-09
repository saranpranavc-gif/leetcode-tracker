// Last updated: 09/07/2026, 09:48:34
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {

            int target = nums1[i];
            int greater = -1;

            int j;

            // Find target in nums2
            for(j = 0; j < nums2.length; j++) {
                if(nums2[j] == target) {
                    break;
                }
            }

            // Find next greater element
            for(int k = j + 1; k < nums2.length; k++) {

                if(nums2[k] > target) {
                    greater = nums2[k];
                    break;
                }
            }

            ans[i] = greater;
        }

        return ans;
    }
}