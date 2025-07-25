// Last updated: 7/25/2025, 8:49:40 AM
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0, xor2 = 0;
        
        for (int num : nums1) xor1 ^= num;
        for (int num : nums2) xor2 ^= num;
        
        int n = nums2.length;
        int m = nums1.length;

        int ans = 0;
        if (n % 2 == 1) ans ^= xor1;
        if (m % 2 == 1) ans ^= xor2;
        
        return ans;
    }
}
