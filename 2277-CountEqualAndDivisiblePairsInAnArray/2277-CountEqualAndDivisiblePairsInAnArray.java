// Last updated: 7/25/2025, 8:50:00 AM
class Solution {
    public int countPairs(int[] arr, int k) {
        int sum  =0;

        for(int i  =0; i<arr.length; i++){
            for(int j  = i+1; j<arr.length; j++){
                if(arr[i] == arr[j] && (i*j) %k ==0){
                    sum++;
                }
            }
        }

        return sum;
    }
}