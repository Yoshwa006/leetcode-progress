// Last updated: 7/25/2025, 8:50:26 AM
class Solution {
    public int findGCD(int[] nums) {
    
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;


    for(int num : nums){
        if(num<min) {
            min = num;
        }
        if(num > max){
            max =num;
        }
    }

    return gcd(min,max);
    }

    public int gcd(int a, int b){
          while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}