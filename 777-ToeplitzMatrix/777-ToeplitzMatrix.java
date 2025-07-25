// Last updated: 7/25/2025, 8:52:37 AM
class Solution {
    public boolean check(int[][] arr,int row,int col){
        int i=row,j=col,n=arr.length,m=arr[0].length;
        while(i<n-1 && j<m-1){
            if(arr[i][j]!=arr[i+1][j+1]){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<m;i++){
            if(!check(matrix,0,i)){
                return false;
            }
        }
        for(int i=1;i<n;i++){
            if(!check(matrix,i,0)){
                return false;
            }
        }
        return true;
    }
}