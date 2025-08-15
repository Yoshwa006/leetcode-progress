// Last updated: 8/15/2025, 1:56:02 PM
class Solution {
    public long maximumHappinessSum(int[] arr, int k) {
        int n = arr.length;
        long step = 0;
        long score = 0;

        Arrays.sort(arr);

        int r = n;
        while(k > 0){
            long curr = arr[r-1]  -step;
            if(curr < 0){
                return score;
            }
            score += arr[r-1] - step;
            step++;
            k--;
            r--;
        }
        
        return score;
    }
}