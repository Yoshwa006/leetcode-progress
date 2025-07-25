// Last updated: 7/25/2025, 8:49:52 AM
class Solution {
    public int arithmeticTriplets(int[] arr, int diff) {
        int count =0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] - arr[i] == diff){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[j]- arr[i] == diff && arr[k] - arr[j]==diff){
                        count++;
                    }
                }
                }
            }
        }

        return count;
    }
}