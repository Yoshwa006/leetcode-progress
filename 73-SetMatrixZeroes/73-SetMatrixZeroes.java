// Last updated: 7/25/2025, 8:54:38 AM
class Solution {
    public void setZeroes(int[][] arr) {
        int n = arr.length;

        boolean[] rows = new boolean[n];
        boolean[] col = new boolean[arr[0].length];


        for(int i=0; i<n; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == 0){
                    rows[i] = true;
                    col[j] =true;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<arr[i].length; j++){
                if(rows[i]|| col[j]){
                    arr[i][j] =0;
                }
            }
        }
    }
}