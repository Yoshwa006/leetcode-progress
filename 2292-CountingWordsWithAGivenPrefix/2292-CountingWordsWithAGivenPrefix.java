// Last updated: 7/25/2025, 8:49:59 AM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count =0;
        for(int i =0; i<words.length; i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }

        return count;
    }
}