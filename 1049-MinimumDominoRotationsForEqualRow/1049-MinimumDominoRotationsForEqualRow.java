// Last updated: 7/25/2025, 8:52:14 AM
class Solution {
    public int minDominoRotations(int[] t, int[] b) {
        int n = t.length;
        int res = Integer.MAX_VALUE;

        for (int in = 1; in <= 6; in++) {
            int cnt1 = 0, cnt2 = 0;
            boolean valid = true;

            for (int i = 0; i < n; i++) {
                if (t[i] != in && b[i] != in) {
                    valid = false;
                    break;
                }
                if (t[i] != in) cnt1++; 
                if (b[i] != in) cnt2++; 
            }

            if (valid) {
                res = Math.min(res, Math.min(cnt1, cnt2));
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
