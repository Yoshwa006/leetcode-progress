// Last updated: 7/25/2025, 8:48:55 AM
class Solution {
    public String triangleType(int[] arr) {
        int a = arr[0], b = arr[1], c = arr[2];

        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }

        if (a == b && b == c) {
            return "equilateral";
        }

        if (a != b && b != c && a != c) {
            return "scalene";
        }

        return "isosceles";
    }
}
