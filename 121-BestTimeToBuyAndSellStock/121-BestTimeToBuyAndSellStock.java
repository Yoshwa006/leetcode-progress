// Last updated: 7/25/2025, 8:54:18 AM
class Solution {
    public int maxProfit(int[] arr) {
        int l =0;
        int r = l +1;
        int max = 0;

    if(arr.length == 1){
        return 0;
    }
        if(arr.length < 3){
            if(arr[0] < arr[1]){
                return arr[1] - arr[0];
            }
            else{
                return 0;
            }
        }
        while (r < arr.length){
            if(arr[r] < arr[l]){
                l = r;
            }
            else if ( arr[l] < arr[r]){
                int diff = arr[r] - arr[l];
                if(max < diff){
                    max = diff;
                }
            }
            r++;
        }

        return max;
    }
}