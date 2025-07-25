// Last updated: 7/25/2025, 8:52:52 AM
class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        Set<Integer> set=new HashSet<>();
        for(int candy:candyType){
            set.add(candy);
            if(set.size()>n/2){
                return n/2;
            }
        }
        return set.size();
    }
}