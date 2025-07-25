// Last updated: 7/25/2025, 8:49:30 AM
class Solution {
    public int[] separateDigits(int[] arr) {
        int size =0;

        for(int num : arr){
            while(num > 0){
                size++;
                num/=10;
            }
        }

        int[] ans= new int[size];

        for(int i = arr.length-1; i>=0; i--){
            int curr = arr[i];
            while(curr > 0){
                ans[--size] = curr%10;
                curr/=10;
            }
        }

        return ans;
    }
}