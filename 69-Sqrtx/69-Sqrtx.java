// Last updated: 7/25/2025, 8:54:41 AM
class Solution {
    public int mySqrt(int n) {
        if (n == 0) return 0;  // Handle n=0 case
        
        int lo = 1, hi = n / 2;
        int res = 1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (mid <= n / mid) {  
                res = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        
        return res;
    }
}