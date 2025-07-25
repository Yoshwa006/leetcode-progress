// Last updated: 7/25/2025, 8:54:50 AM
class Solution {
    public void rotate(int[][] arr) {
        for( int i =0; i<arr.length; i++){
            for( int j=i+1; j<arr[i].length; j++){
                 int temp = arr[i][j];
                 arr[i][j] = arr[j][i];
                 arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length - 1;

            while (start < end) {
                // For odd-length rows, skip the middle element
                if (start == arr[i].length / 2) break;

                // Swap elements
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                // Move pointers
                start++;
                end--;
            }
    }
}
}