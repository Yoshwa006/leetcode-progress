// Last updated: 7/25/2025, 8:51:38 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[]=new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                c++;
            }
            ans[i]=c;
        }
        return ans;
    }
}