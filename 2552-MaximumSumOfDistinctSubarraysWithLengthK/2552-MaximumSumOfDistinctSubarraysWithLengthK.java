// Last updated: 7/25/2025, 8:49:38 AM
class Solution {
    public long maximumSubarraySum(int[] arr, int k) {

    Set<Integer> set = new HashSet<>();
    long currSum = 0, maxSum = 0;
    int left = 0;

    for (int right = 0; right < arr.length; right++) {
        while (set.contains(arr[right])) {
            set.remove(arr[left]);
            currSum -= arr[left];
            left++;
        }

        set.add(arr[right]);
        currSum += arr[right];

        if (set.size() == k) {
            maxSum = Math.max(maxSum, currSum);
            
            set.remove(arr[left]);
            currSum -= arr[left];
            left++;
        }
    }

    return maxSum;
}
}