// Last updated: 7/25/2025, 8:49:45 AM
class Solution {
    public boolean findSubarrays(int[] nums) {
        int i =0, j=i+1;

HashSet<Integer> set= new HashSet<>();
        while(j < nums.length){
            int curr = nums[i] + nums[j];
            if(!set.isEmpty() && set.contains(curr)){
                return true;
            }
            set.add(curr);
            i++;
            j++;
        }

        return false;
    }
}