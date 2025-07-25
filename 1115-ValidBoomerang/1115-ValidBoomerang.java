// Last updated: 7/25/2025, 8:52:11 AM
class Solution {
    public boolean isBoomerang(int[][] arr) {
      if (arr == null || arr.length < 3) {
        throw new IllegalArgumentException("Input array must have at least three points");
    }

    // Use cross product to check collinearity
    int x1 = arr[0][0], y1 = arr[0][1];
    int x2 = arr[1][0], y2 = arr[1][1];
    int x3 = arr[2][0], y3 = arr[2][1];

    // Calculate the cross-product determinant
    int determinant = (y2 - y1) * (x3 - x2) - (y3 - y2) * (x2 - x1);

    // If determinant is zero, points are collinear
    return determinant != 0;
}
}