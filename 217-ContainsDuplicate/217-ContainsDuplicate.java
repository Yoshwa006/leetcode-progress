// Last updated: 7/25/2025, 8:53:49 AM
class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();


        for(int num: arr){
            if(!set.isEmpty() && set.contains(num)){
                return true;
            }
            set.add(num);
        }

        return false;
    }
}