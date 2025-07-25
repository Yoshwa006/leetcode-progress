// Last updated: 7/25/2025, 8:52:43 AM
class Solution {
    public int[][] floodFill(int[][] arr, int sr, int sc, int color) {
        if(arr[sr][sc] == color) return arr;
        int start = arr[sr][sc];
        run(arr,color, start, sr,sc);
        return arr;
    }

    void run(int[][] arr,int color,int start, int i, int j){
    
        if(i<0 || i>=arr.length || j<0 || j>=arr[0].length) return;

        if(start != arr[i][j]) return;

        arr[i][j] = color;
       
        run(arr,color,start,i+1,j);
        run(arr,color,start,i-1,j);
        run(arr,color,start,i,j+1);
        run(arr,color,start,i,j-1);
    }
}