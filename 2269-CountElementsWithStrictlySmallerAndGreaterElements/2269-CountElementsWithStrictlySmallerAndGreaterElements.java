// Last updated: 7/25/2025, 8:50:03 AM
class Solution {
    public int countElements(int[] nums) {
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<=min){
                min = nums[i];
            }
            if(nums[i]>=max){
                max= nums[i];
            }

        }
        int count=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]>min && nums[i]<max){
                count++;
            }
        }
        return count;

   }
}