// Last updated: 7/25/2025, 8:49:16 AM
class Solution {
    public int distanceTraveled(int a, int b) {
    return (a + Math.min((a - 1) / 4, b)) * 10;
}

}