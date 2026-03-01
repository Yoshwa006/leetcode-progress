// Last updated: 01/03/2026, 22:31:07
class Solution {
    public int minimumOperations(int[] nums) {
        int sum =0;
        for(int i=0;i<nums.length;i++){
           if(nums[i] %3 ==0){
            continue;
           } else{
            sum++;
           }
        }
        
        return sum;
    }
}