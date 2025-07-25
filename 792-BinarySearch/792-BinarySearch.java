// Last updated: 7/25/2025, 8:52:32 AM
class Solution {
    public int search(int[] arr, int target) {
        int l = 0;
        int n = arr.length;
        int r = n - 1;
        int m = l + (r - l) / 2;

        while (l<=r) {
            if(arr[m] == target){
                return m;
            }
            else if(arr[m] <target){
                l=m+1;
            }
            else{
                r=m-1;
            }
            m = l + (r-l)/2;
        }

        return -1;
    }
}