// Last updated: 7/25/2025, 8:50:24 AM
import java.math.BigInteger;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
       PriorityQueue<BigInteger> q = new PriorityQueue<>(Collections.reverseOrder());

        // Convert String array to BigInteger array
        BigInteger[] arr = new BigInteger[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = new BigInteger(nums[i]);  // Convert to BigInteger
        }

        // Add all BigInteger elements to the PriorityQueue
        for (BigInteger num : arr) {
            q.add(num);
        }

        // Poll k times to get the k-th largest element
        BigInteger f = BigInteger.ZERO;
        while (!q.isEmpty() && k > 0) {
            f = q.poll();
            k--;
        }

        // Return the k-th largest number as a string
        return f.toString();  // C
}}