// Last updated: 7/25/2025, 8:53:30 AM
class Solution {
    public int findDuplicate(int[] arr) {
        Arrays.sort(arr);

        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                return arr[i];
            }
        }

        return -1;
    }
}