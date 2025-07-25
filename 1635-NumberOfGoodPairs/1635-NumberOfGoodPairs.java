// Last updated: 7/25/2025, 8:51:17 AM
class Solution {
    public int numIdenticalPairs(int[] arr) {
        int good = 0;

        for( int i=0; i<arr.length; i++){
            for( int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    good++;
                }
            }
        }

        return good;
    }
}