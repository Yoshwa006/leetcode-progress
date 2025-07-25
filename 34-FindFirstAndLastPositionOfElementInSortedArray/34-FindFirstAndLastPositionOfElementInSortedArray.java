// Last updated: 7/25/2025, 8:54:53 AM
class Solution {
    public int[] searchRange(int[] arr, int target) {
        int l =0;
        int r =arr.length -1;
        int[] result = {-1,-1};

        while(l<=r){
            int m = l+(r-l)/2;

            if(arr[m] == target){
                int left = m;
                int right = m;


                while(left >0 && arr[left-1] == target){
                    left--;
                }

                while(right<arr.length -1 && arr[right+1] == target){
                    right++;
                }

                result[0] = left;
                result[1] = right;
                return result;
            }


            else if(arr[m] < target){
                l = m+1;
            }
            else{
                r=m-1;
            }
        }

        return result;
    }
}