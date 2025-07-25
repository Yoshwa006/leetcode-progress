// Last updated: 7/25/2025, 8:54:37 AM
class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int i = 0;

        while (i < arr.length && arr[i][0] <= target) {
            if (arr[i][0] == target) return true;
            i++;
        }

        if (i == 0) return false; 
        i--; 

        for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == target) {
                return true;
            }
        }

        return false;
    }
}
