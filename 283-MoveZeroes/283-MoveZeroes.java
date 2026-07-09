// Last updated: 09/07/2026, 09:48:50
class Solution {
    public void moveZeroes(int[] nums) {
        
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[count];
                nums[count]=temp;
                count++;
            }
        }
    }
}