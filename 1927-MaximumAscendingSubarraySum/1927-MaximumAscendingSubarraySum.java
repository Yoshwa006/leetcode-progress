// Last updated: 7/25/2025, 8:50:47 AM
class Solution {
    public int maxAscendingSum(int[] arr) {
        int max = arr[0];
        int curr = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] <= arr[i-1]){
                max = Math.max(curr,max);
                curr =0;
                curr +=arr[i];
        }
        else{
            curr+= arr[i];
            if(curr>max){
                max = curr;
            }
        }
        }

        return max;
    }
}