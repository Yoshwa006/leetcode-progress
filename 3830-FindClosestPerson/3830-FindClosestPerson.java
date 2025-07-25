// Last updated: 7/25/2025, 8:48:15 AM
class Solution {
    public int findClosest(int x, int y, int z) {
        int a = Math.abs(z-x);
        int b = Math.abs(z-y);
        if(a == b){
            return 0;
        }
        if(a<b){
            return 1;
        }
        return 2;
    }
}