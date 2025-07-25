// Last updated: 7/25/2025, 8:50:05 AM
class Solution {
    public boolean checkValid(int[][] arr) {
        Set<Integer> set = new HashSet<>();

        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                set.add(arr[i][j]);
            }
            if (set.size() != arr[i].length) {
                return false;
            }
            set.clear();
        }
        for (int j = 0; j < n; j++) {
            set.clear();
            for (int i = 0; i < n; i++) {
                set.add(arr[i][j]);
            }
            if (set.size() != n) {
                return false;
            }
        }
        return true;
    }
}