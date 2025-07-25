// Last updated: 7/25/2025, 8:49:26 AM
class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countLess(nums, upper) - countLess(nums, lower - 1);
    }
    private long countLess(int[] nums, int sum){
        long res = 0;
        int j  = nums.length-1;
        for (int i = 0 ; i < j; ++i){
            while(i < j && nums[i] + nums[j] > sum)
              --j;
            res += j-i;

        }
        return res;
    }
}