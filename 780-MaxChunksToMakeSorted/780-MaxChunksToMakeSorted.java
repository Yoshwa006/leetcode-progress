// Last updated: 7/25/2025, 8:52:36 AM
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int count =0;
        int max = -232132;
       for(int i=0; i<arr.length; i++){
        if(max < arr[i]){
            max = arr[i];
        }
        if(max == i){
            count ++;
        }
        }

        return count;
    }
}