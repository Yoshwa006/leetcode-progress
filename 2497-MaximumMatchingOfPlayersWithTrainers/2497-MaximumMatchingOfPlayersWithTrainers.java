// Last updated: 7/25/2025, 8:49:44 AM
class Solution {
    public int matchPlayersAndTrainers(int[] p, int[] t) {
        Arrays.sort(p);
        Arrays.sort(t);
        int i = 0, j = 0;
        int count = 0;
        
        while (i < p.length && j < t.length) {
            if (t[j] >= p[i]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        
        return count;
    }
}
