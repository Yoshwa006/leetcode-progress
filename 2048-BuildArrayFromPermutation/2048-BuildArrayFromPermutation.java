// Last updated: 7/25/2025, 8:50:34 AM
class Solution {
    public int[] buildArray(int[] arr) {
        int[] ans = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            ans[i] = arr[arr[i]];
        }

        return ans;
    }
}