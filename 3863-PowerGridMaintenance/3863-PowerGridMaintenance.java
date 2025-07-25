// Last updated: 7/25/2025, 8:48:11 AM
class Solution {
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
         
        List<Integer>[] graph = new ArrayList[c + 1];
        for (int i = 1; i <= c; i++) graph[i] = new ArrayList<>();

        for (int[] conn : connections) {
            graph[conn[0]].add(conn[1]);
            graph[conn[1]].add(conn[0]);
        }

        int[] componentId = new int[c + 1];
        int comp = 0;
        boolean[] visited = new boolean[c + 1];
        for (int i = 1; i <= c; i++) {
            if (!visited[i]) {
                comp++;
                dfs(i, comp, graph, componentId, visited);
            }
        }

        Map<Integer, TreeSet<Integer>> onlineStations = new HashMap<>();
        for (int i = 1; i <= c; i++) {
            int cid = componentId[i];
            onlineStations.computeIfAbsent(cid, k -> new TreeSet<>()).add(i);
        }

        boolean[] isOffline = new boolean[c + 1];
        List<Integer> result = new ArrayList<>();

        for (int[] q : queries) {
            int type = q[0];
            int x = q[1];

            int cid = componentId[x];

            if (type == 1) {
                if (!isOffline[x]) {
                    result.add(x);
                } else {
                    TreeSet<Integer> online = onlineStations.get(cid);
                    if (online.isEmpty()) {
                        result.add(-1);
                    } else {
                        result.add(online.first());
                    }
                }
            } else if (type == 2) {
                if (!isOffline[x]) {
                    isOffline[x] = true;
                    TreeSet<Integer> online = onlineStations.get(cid);
                    online.remove(x);
                }
            }
        }

        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }

    private void dfs(int node, int compId, List<Integer>[] graph, int[] componentId, boolean[] visited) {
        visited[node] = true;
        componentId[node] = compId;
        for (int nei : graph[node]) {
            if (!visited[nei]) {
                dfs(nei, compId, graph, componentId, visited);
            }
        }
    }
}
