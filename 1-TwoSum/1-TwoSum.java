// Last updated: 7/25/2025, 8:55:19 AM
class Solution {
    public int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i =0; i<arr.length; i++){

            int k = target- arr[i];
            if(mpp.containsKey(k)){
                return new int[]{mpp.get(k), i};
            }

            mpp.put(arr[i], i);
        }

        return new int[]{};
    }
}