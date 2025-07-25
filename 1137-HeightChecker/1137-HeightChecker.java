// Last updated: 7/25/2025, 8:52:07 AM
class Solution {
    public int heightChecker(int[] arr) {
        int[] res = arr.clone();

        Arrays.sort(res);
        int count =0, k=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != res[i]){
                count++;
            }
        }

        return count;
    }
}