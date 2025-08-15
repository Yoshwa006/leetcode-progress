// Last updated: 8/15/2025, 3:04:43 PM
class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 1;
        int right = 0;
        for (int c : candies) {
            right = Math.max(right, c);
        }
        
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canServe(candies, k, mid)) {
                ans = mid; 
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    
    private boolean canServe(int[] candies, long k, int x) {
        long count = 0;
        for (int c : candies) {
            count += c / x;
        }
        return count >= k;
    }
}
