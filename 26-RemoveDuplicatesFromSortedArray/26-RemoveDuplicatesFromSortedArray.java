// Last updated: 7/25/2025, 8:54:59 AM
class Solution {
    public int removeDuplicates(int[] arr) {
        int l = 0;
        int r = 1;

        while(r<arr.length){
            if(arr[l] != arr[r]){
                int temp = arr[r];
                arr[l+1] = temp;
                l++;
            }
            else{
    
                r++;
            }
        }

        return l+1;
    }
}