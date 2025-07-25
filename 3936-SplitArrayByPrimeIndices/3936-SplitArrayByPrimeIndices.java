// Last updated: 7/25/2025, 8:48:03 AM
class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;

       
        boolean[] prime = new boolean[n];
        if (n > 0) prime[0] = false; 
        if (n > 1) prime[1] = false; 
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }

       
        long Nsum = 0;
        long primeSum = 0;
        for (int i = 0; i < n; i++) {
            if (prime[i]) {
                primeSum += nums[i];
            } else {
                Nsum += nums[i];
            }
        }
        return Math.abs(primeSum - Nsum);
    }
}
