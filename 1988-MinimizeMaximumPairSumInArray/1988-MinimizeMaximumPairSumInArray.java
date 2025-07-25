// Last updated: 7/25/2025, 8:50:42 AM
class Solution {
    public int minPairSum(int[] arr) {
        Arrays.sort(arr);

        int l = 0;
        int r = arr.length -1;
        int max = -1;
        while (l<r){
            if(arr[l] + arr[r] > max){
                max = arr[l] + arr[r];
            }
            l++;
            r--;
        }
        return max;
    }
}