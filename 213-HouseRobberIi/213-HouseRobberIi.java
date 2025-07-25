// Last updated: 7/25/2025, 8:53:51 AM
class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        if(n == 0) return 0;
        if(n == 1){
            return nums[0];
        }
        int f = help(nums, 0 , n-2);
        int s = help(nums, 1, n-1);

        return Math.max(f,s);
    }

    int help(int[] arr , int start , int end){
        int n = end - start +1;
        if( n==0) return 0;
        if (n ==1) return (arr[start]);

        int[] dp = new int[n];
        dp[0] = arr[start];
        dp[1] = Math.max(arr[start], arr[start+1]);

        for(int i= 2; i<n; i++){
            dp[i] = Math.max(dp[i-1] , dp[i-2] + arr[start+i]);
        }

        return dp[n-1];
    }
}