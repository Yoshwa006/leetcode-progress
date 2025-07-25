// Last updated: 7/25/2025, 8:51:22 AM
class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = start +2 *i;
            ans^=arr[i];
        }
        return ans;
    }
}