// Last updated: 7/25/2025, 8:53:07 AM
class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        while(n>0){
            ++i;
            n=n-i;
        }return i-1;
    }
}