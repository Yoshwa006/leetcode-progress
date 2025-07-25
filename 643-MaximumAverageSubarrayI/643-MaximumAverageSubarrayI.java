// Last updated: 7/25/2025, 8:52:48 AM
class Solution {
    public double findMaxAverage(int[] arr, int k) {

        if(arr.length <2){
            return (double) arr[0];
        }
        int curr =0;
        int max =0;


        for(int i=0; i<k; i++){
            curr+= arr[i];
        }
        max = curr;
        int index  =0;
        for(int i =k; i<arr.length; i++){
            curr -=arr[index];
            curr = curr + arr[i];
            max = Math.max(curr,max);
            index++;
        }

        return (double) max/k;
    }
}