// Last updated: 09/07/2026, 09:49:04
class Solution {
    public int majorityElement(int[] nums) {
         int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
        
    }
}