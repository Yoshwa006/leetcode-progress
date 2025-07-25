// Last updated: 7/25/2025, 8:48:04 AM
class Solution {
    public int minSwaps(int[] nums) {
        List<Integer> evenIdx = new ArrayList<>();
        List<Integer> oddIdx = new ArrayList<>();

        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) evenIdx.add(i);
            else oddIdx.add(i);
        }

        int n = nums.length;
        int evenCount = evenIdx.size();
        int oddCount = oddIdx.size();

        if (Math.abs(evenCount - oddCount) > 1) return -1;

        int res = Integer.MAX_VALUE;
        if (evenCount >= oddCount) {
            res = Math.min(res, getMoves(evenIdx));
        }

        if (oddCount >= evenCount) {
            res = Math.min(res, getMoves(oddIdx));
        }

        return res;
    }
        int getMoves(List<Integer> idxList) {
        int moves = 0;
        int start = 0;
        for (int i = 0; i < idxList.size(); i++) {
            moves += Math.abs(idxList.get(i) - (start + 2 * i));
            start = 0;
        }
        return moves;
    }
}