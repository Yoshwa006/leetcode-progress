// Last updated: 7/25/2025, 8:52:57 AM
class Solution {
    public int singleNonDuplicate(int[] arr) {
        int left =0;
        int right =arr.length-1;

        while(left<right){
            int mid = (left+right) /2;

            if(mid %2 == 1){
                mid--;
            }
            if(arr[mid] != arr[mid+1]){
                right = mid;
            }
            else{
                left = mid+2;
            }
        }
       return arr[left];
    }
}