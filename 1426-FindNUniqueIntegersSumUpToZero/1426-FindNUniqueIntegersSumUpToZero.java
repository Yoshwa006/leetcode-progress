// Last updated: 7/25/2025, 8:51:44 AM
class Solution {
    public int[] sumZero(int n){
        int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = i * 2 - n + 1;
            }


        return arr;
    }
}