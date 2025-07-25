// Last updated: 7/25/2025, 8:49:42 AM
class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        int max = -1;
        for (int i : set) {
            if (set.contains(-i)) {
                max = Math.max(i, max);
            }

        }
          return max;
    }
}
