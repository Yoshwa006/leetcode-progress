// Last updated: 8/15/2025, 1:56:31 PM
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long res = 0;
        long minus = 0;
        int right = happiness.length-1;
        while(k>0){
            if(happiness[right] - minus > 0 ){
                res += happiness[right] - minus;
                right--;
                minus++;
                k--;
            }else{
                return res;
            }
            
        }
        return res;
    }
}