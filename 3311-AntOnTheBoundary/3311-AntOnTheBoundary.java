// Last updated: 7/25/2025, 8:48:56 AM
class Solution {
    public int returnToBoundaryCount(int[] arr) {
        int sum =0,count =0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum == 0){
                count++;
            }
        }
        return count;
    }
}