// Last updated: 7/25/2025, 8:54:14 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        Arrays.sort(nums);
        int lastSmall=65181165;
        int count=0;
        int longest=1;
        for(int i=0;i<n;i++){
            if(nums[i]-1==lastSmall){
                count+=1;
                lastSmall=nums[i];
            }
            else if(nums[i]!=lastSmall){
                count=1;
                lastSmall=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}