// Last updated: 7/25/2025, 8:51:21 AM
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int size = (n*(n+1))/2 , nextIdx = 0, k = 0;

        int[] prefixSum = new int[size];
        int idx = 0;
         int MOD = 1_000_000_007;

        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++) {
                sum = sum + nums[j];
                prefixSum[idx++] = sum;
            }
        }
        
        
        Arrays.sort(prefixSum);
        int sum = 0;
        for( int i = left-1; i<right; i++){
            sum = (sum + prefixSum[i])%MOD;
        }
        return sum;
    }
}