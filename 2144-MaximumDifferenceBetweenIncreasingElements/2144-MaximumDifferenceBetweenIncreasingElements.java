// Last updated: 7/25/2025, 8:50:19 AM
class Solution {
    public int maximumDifference(int[] arr) {
        int n = arr.length-1;
        int curr = -1, max =-1;

        for(int i= n; i>=0; i--){
            
        if(arr[i] > curr){
            curr = arr[i];
            continue;
        } 
         if(arr[i] < curr){
             int d = curr - arr[i];
         if(d > max){
             max = d ;
         }
         }
        
        
        }
        return max;
    }
}