// Last updated: 7/25/2025, 8:49:23 AM
class Solution {
    public int maxNumOfMarkedIndices(int[] arr) {
        Arrays.sort(arr);
        int l =0; 
        int r = (arr.length +1) / 2;
        int res =0;
        while(r<arr.length){
            if(arr[l] * 2 <= arr[r]){
                res += 2;
                l++;
            }
            r++;
        }

        return res;
    }
}