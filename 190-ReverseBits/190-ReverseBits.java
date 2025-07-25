// Last updated: 7/25/2025, 8:53:57 AM
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int num) {
        int result = 0; // To store the reversed number
        for (int i = 0; i < 32; i++) { // Assuming 32-bit integers
            int bit = (num >> i) & 1; // Extract the i-th bit of num
            result |= (bit << (31 - i)); // Place it in the reversed position
        }


        return result;
    }
}