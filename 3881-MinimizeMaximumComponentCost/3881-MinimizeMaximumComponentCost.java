// Last updated: 7/25/2025, 8:48:08 AM
import java.util.*;

class Solution {
    static class DSU {
        int[] parent;

        DSU(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }

        int find(int x) {
            if (x != parent[x]) parent[x] = find(parent[x]);
            return parent[x];
        }

        boolean union(int x, int y) {
            int fx = find(x);
            int fy = find(y);
            if (fx == fy) return false;
            parent[fx] = fy;
            return true;
        }
    }

    public int minCost(int n, int[][] edges, int k) {
       
        Arrays.sort(edges, Comparator.comparingInt(a -> a[2]));

        DSU dsu = new DSU(n);
        List<Integer> mstWeights = new ArrayList<>();

      
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            if (dsu.union(u, v)) {
                mstWeights.add(w);
            }
        }

       
        mstWeights.sort(Collections.reverseOrder());
        for (int i = 0; i < k - 1 && !mstWeights.isEmpty(); i++) {
            mstWeights.remove(0);
        }

        return mstWeights.isEmpty() ? 0 : mstWeights.get(0);
    }
}
