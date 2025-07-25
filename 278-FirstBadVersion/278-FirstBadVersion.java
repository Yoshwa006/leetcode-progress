// Last updated: 7/25/2025, 8:53:33 AM
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1, r = n;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (isBadVersion(mid)) {
                r = mid; 
            } else {
                l = mid + 1; 
            }
        }

        return r; 
    }
}
