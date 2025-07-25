// Last updated: 7/25/2025, 8:48:34 AM
class Solution {
    public int[] getFinalState(int[] arr, int k, int m) {
        for(int j=0; j<k; j++){
            int min =0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        arr[min] = arr[min] *m;
    }
     return arr;
    }
   
}