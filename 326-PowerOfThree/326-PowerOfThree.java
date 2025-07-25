// Last updated: 7/25/2025, 8:53:26 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }

        while(n%3 ==0){
            n= n/3;
        }

        return n==1;
    }
}