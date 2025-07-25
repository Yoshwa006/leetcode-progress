// Last updated: 7/25/2025, 8:50:59 AM
class Solution {
    public int maximumWealth(int[][] arr) {
        int max = 0;
        int curr = 0;
        for(int i =0; i<arr.length; i++ ){
            curr =0;
            for(int j = 0; j<arr[i].length; j++){
                curr+= arr[i][j];
            }
            if(curr > max){
                max = curr;
            }
        }

        return max;
    }
}