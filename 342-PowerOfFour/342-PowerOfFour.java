// Last updated: 7/25/2025, 8:53:25 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1){
            return false;
        }
if(n==1){
    return true;
}
        while(n%4 ==0){
            n= n/4;
        }

        return n==1;
    }
    }