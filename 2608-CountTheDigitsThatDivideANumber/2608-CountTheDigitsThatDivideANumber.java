// Last updated: 7/25/2025, 8:49:35 AM
class Solution {
    public int countDigits(int n) {
        int temp = n;
        int count =0;

        while(n!=0){
            int  k = n%10;

            if(temp % k == 0){
                count++;
            }
            n/=10;
        }

        return count;
    }
}