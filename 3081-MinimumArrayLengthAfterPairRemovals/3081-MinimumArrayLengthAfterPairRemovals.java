// Last updated: 7/25/2025, 8:49:09 AM
class Solution {
    public int minLengthAfterRemovals(List<Integer> arr) {
        int l =0;
        int n = arr.size();
        int r = (n+1) /2;
        int res =0;

        while(r< n){
            if(arr.get(l) < arr.get(r)){
                res += 2;
                l++;
            }
            r++;
        }

        return n - res;
    }
}