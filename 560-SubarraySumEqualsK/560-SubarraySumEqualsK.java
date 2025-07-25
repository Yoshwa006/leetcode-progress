// Last updated: 7/25/2025, 8:52:58 AM
class Solution {
    public int subarraySum(int[] arr, int k) {

        int count = 0;
    int currentSum = 0;

    // HashMap to store frequency of prefix sums
    HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
    prefixSumMap.put(0, 1); // To handle the case when a subarray sum is exactly k at an earlier index

    // Iterate through the array
    for (int num : arr) {
        currentSum += num; // Update the running sum

        // Check if currentSum - k exists in the prefixSumMap
        if (prefixSumMap.containsKey(currentSum - k)) {
            count += prefixSumMap.get(currentSum - k);
        }

        // Store the current sum in the prefixSumMap
        prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
    }

    return count; //
        }
}