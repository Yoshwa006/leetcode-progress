// Last updated: 7/25/2025, 8:51:26 AM
class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
            Arrays.sort(arr);
           return (arr[n-1]-1) *(arr[n-2]-1);
        }
}