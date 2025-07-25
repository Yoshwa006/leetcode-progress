// Last updated: 7/25/2025, 8:50:27 AM
class Solution {
    public int numOfStrings(String[] p, String word) {
        int count =0;
        for(String s : p){
            if(word.contains(s)){
                count++;
            }
        }

        return count;
    }
}