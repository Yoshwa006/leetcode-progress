// Last updated: 7/25/2025, 8:48:44 AM
class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i =1; i<nums.length; i++){
            if(nums[i]%2 == 0){
                if(nums[i-1] %2==0){
                    return false;
                }
            }
            else if(nums[i]%2 != 0){
                if(nums[i-1] %2!=0){
                    return false;
                }
            }

        }

        return true;
    }
}