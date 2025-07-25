// Last updated: 7/25/2025, 8:48:20 AM
class Solution {
    public int countSubarrays(int[] arr) {
        int i =0, j=i+1, k=j+1;
        int count =0;

        while(k<arr.length){
            int curr = arr[i] + arr[k];
            if(arr[j] / 2.0 == curr){
                count++;
            }

            i++;
            j++;
            k++;
        }

        return count;
    }
}