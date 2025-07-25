// Last updated: 7/25/2025, 8:54:49 AM
class Solution {
    public double myPow(double a, int b) {
        if (b == 0) return 1;

        if (b < 0) {
            a = 1 / a;
            
            return a * myPow(a, -(b + 1));
        }

        double res = myPow(a, b / 2);
        if (b % 2 == 0) {
            return res * res;
        } else {
            return res * res * a;
        }
    }
}
