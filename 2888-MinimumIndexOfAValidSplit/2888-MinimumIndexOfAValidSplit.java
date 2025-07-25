// Last updated: 7/25/2025, 8:49:12 AM
class Solution {
    public int minimumIndex(List<Integer> arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        int n = arr.size();
        int t = arr.get(0), maxFreq = 0;


        for (int num : arr) {
            int count = freq.getOrDefault(num, 0) + 1;
            freq.put(num, count);

            if (count > maxFreq) {
                maxFreq = count;
                t = num;
            }
        }


        if (freq.get(t) * 2 <= n) return -1;

        int leftCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr.get(i) == t) {
                leftCount++;
            }

            int leftSize = i + 1;
            int rightSize = n - leftSize;
            int rightCount = freq.get(t) - leftCount;

            if (leftCount * 2 > leftSize && rightCount * 2 > rightSize) {
                return i;
            }
        }

        return -1;
    }
}
