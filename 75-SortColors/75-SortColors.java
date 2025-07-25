// Last updated: 7/25/2025, 8:54:36 AM
class Solution {
    public void sortColors(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        int m = 0;


        while(m<=r){
            
            switch(arr[m]){

                case 0:
                int temp = arr[m];
                arr[m] = arr[l];
                arr[l] = temp;
                l++;
                m++;
                break;
                case 1:
                m++;
                break;
                case 2:
                int t = arr[r];
                arr[r] = arr[m];
                arr[m] = t;
                r--;
                break;
            }

        }
    
    }
}