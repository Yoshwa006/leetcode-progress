// Last updated: 7/25/2025, 8:49:32 AM
class Solution {
    public int maximumCount(int[] nums) {
        int neg =0;
        int pos =0;


        for(int num : nums){
            if(num < 0){
                neg++;
            }
            else if(num >0){
                pos++;
            }
        }

        return Math.max(neg,pos);
    }
}