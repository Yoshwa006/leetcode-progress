// Last updated: 7/25/2025, 8:49:31 AM
class Solution {
    public int alternateDigitSum(int n) {

        String s = String.valueOf(n);

        int len = s.length();
        int sum =0;

        while(n!=0){
            if(len %2 ==0){
                sum-= n%10;
            }
            else{
                sum+=n%10;
            }
            len--;
            n/= 10;
        }

        return sum;
    }

}