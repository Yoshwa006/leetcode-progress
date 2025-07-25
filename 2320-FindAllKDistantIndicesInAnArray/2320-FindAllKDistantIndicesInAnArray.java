// Last updated: 7/25/2025, 8:49:57 AM
import java.util.*;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        int[] diff = new int[n + 1];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                int start = Math.max(0, i - k);
                int end = Math.min(n, i + k + 1);
                diff[start]++;
                diff[end]--;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += diff[i];
            if (sum > 0) {
                result.add(i);
            }
        }

        return result;
    }
}
