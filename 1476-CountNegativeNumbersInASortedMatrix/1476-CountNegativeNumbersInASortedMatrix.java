// Last updated: 7/25/2025, 8:51:40 AM
class Solution {
    public int countNegatives(int[][] arr) {
        int count =0;
        for(int i=0; i<arr.length; i++){
            for(int j =0; j<arr[0].length; j++){
                if(arr[i][j] < 0){
                    count++;
                }
            }
        }

        return count;
    }
}