// Last updated: 7/30/2025, 5:49:50 PM
class Solution {
    public boolean canJump(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(i > max) return false;

            max = Math.max(i+arr[i], max);
        }

        return true;
    }
}