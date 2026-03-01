// Last updated: 01/03/2026, 22:31:19
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