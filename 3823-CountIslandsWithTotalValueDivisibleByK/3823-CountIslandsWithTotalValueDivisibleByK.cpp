// Last updated: 7/25/2025, 8:48:16 AM
class Solution {
public:
    int m, n, k;
    vector<vector<int>> grid;
    vector<vector<bool>> visited;

    int dfs(int x, int y) {
        if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] <= 0 || visited[x][y]) {
            return 0;
        }
        visited[x][y] = true;
        long long sum = grid[x][y];
        sum += dfs(x + 1, y);
        sum += dfs(x - 1, y);
        sum += dfs(x, y + 1);
        sum += dfs(x, y - 1);
        return sum;
    }

    int countIslands(vector<vector<int>>& grid_, int k_) {
        grid = grid_;
        k = k_;
        m = grid.size();
        n = grid[0].size();
        visited = vector<vector<bool>>(m, vector<bool>(n, false));

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] > 0) {
                    int islandSum = dfs(i, j);
                    if (islandSum % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
};
