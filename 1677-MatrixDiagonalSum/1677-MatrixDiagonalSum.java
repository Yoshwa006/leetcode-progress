// Last updated: 7/25/2025, 8:51:10 AM
class Solution {
    public int diagonalSum(int[][] arr) {
        int sum =0;
        for(int i=0; i<arr.length; i++){
            if(i == arr.length -i-1){
                sum-= arr[i][i];
            }
            sum =sum+ arr[i][i] + arr[i][arr.length -i-1];
         }

         return sum;
    }
}