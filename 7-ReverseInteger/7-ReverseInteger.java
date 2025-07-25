// Last updated: 7/25/2025, 8:55:13 AM
class Solution {
    public int reverse(int n) {
    int reversed = 0;
    while (n != 0) {
        int digit = n % 10;  // Extract the last digit
        n /= 10;  // Remove the last digit
        
        // Check for overflow before updating reversed
        if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
            return 0;  // Overflow occurred, return 0
        }
        if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < Integer.MIN_VALUE % 10)) {
            return 0;  // Underflow occurred, return 0
        }

        reversed = reversed * 10 + digit;  // Append the digit
    }
    return reversed;
}
}