// Last updated: 7/25/2025, 8:53:38 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        long sum=1;
        int flag=0;
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
          if(nums[i]==0){
            flag++;
          }else{
            sum=sum*nums[i];
          }
        }
           if (flag> 1) {
            return result; 
        }
        if(flag>0){
            for(int i=0;i<nums.length;i++){
             if(nums[i]==0){
                result[i]=(int)sum;
             }else{
                result[i]=0;
             }
            }}
            else{
            for(int i=0;i<nums.length;i++){
            result[i]=(int)(sum/nums[i]);

            }


            }
        
        return result;
    }
}