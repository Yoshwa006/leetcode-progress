// Last updated: 7/25/2025, 8:49:17 AM
class Solution {
    public int findNonMinOrMax(int[] arr) {
        if(arr.length ==2 || arr.length == 1){
            return -1;
        }
        Arrays.sort(arr);

        return arr[arr.length/2];
    }
}