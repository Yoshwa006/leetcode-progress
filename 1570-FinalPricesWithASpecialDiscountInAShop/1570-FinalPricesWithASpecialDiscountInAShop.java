// Last updated: 7/25/2025, 8:51:28 AM
class Solution {
    public int[] finalPrices(int[] arr) {
         for(int i =0; i<arr.length-1; i++){
            for( int j = i+1; j<arr.length; j++){
                if(arr[j] <= arr[i]){
                    arr[i] = arr[i] - arr[j];
                    break;
                }
            }
        }

        return arr;
    }
}