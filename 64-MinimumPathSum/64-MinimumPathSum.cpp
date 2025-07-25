// Last updated: 7/25/2025, 8:54:44 AM
class Solution {
public:
    int minPathSum(vector<vector<int>>& arr) {
        int rows = arr.size();
        int col = arr[0].size();

      vector<vector<int>> dp(rows, vector<int>(col, -1));
        dp[0][0] = arr[0][0];
        for(int i=1; i<col; i++){
            dp[0][i] = dp[0][i-1] + arr[0][i];
        }

        for(int j=1; j<rows; j++){
            dp[j][0] = dp[j-1][0] + arr[j][0];
        }

        for(int i=1; i<rows; i++){
            for(int j=1; j<col; j++){
                int m = min(dp[i-1][j], dp[i][j-1]);
                dp[i][j] = arr[i][j] + m;
            }
        }

        return dp[rows-1][col-1];
    }
};