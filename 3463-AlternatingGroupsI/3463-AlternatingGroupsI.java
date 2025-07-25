// Last updated: 7/25/2025, 8:48:38 AM
class Solution {
    public int numberOfAlternatingGroups(int[] arr) {
        int n = arr.length;
        int count =0;
        if(arr[0] != arr[1] && arr[0] != arr[n-1]){
            count++;
        }

        if(arr[n-1] != arr[n-2] && arr[n-1] != arr[0]){
            count++;
        }

        for(int i = 1; i<=n-2; i++){
            if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                count++;
            }
        }

        return count;
    }
}