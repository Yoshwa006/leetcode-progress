// Last updated: 7/25/2025, 8:50:54 AM
class Solution {
    public int largestAltitude(int[] arr) {
        int cur =0, max = 0;

        for(int i=0; i<arr.length; i++){
            cur+= arr[i];
            max = Math.max(cur,max);
        }

        return max;
    }
}