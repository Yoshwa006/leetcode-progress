// Last updated: 7/25/2025, 8:54:17 AM
class Solution {
    public int maxProfit(int[] arr) {
        int min = Integer.MAX_VALUE;
        int cost = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > min){
                cost += arr[i] - min;
                min = arr[i];
            }
        }

        return cost;
    }
}