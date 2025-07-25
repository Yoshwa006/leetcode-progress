// Last updated: 7/25/2025, 8:49:11 AM
class Solution {
    public boolean isAcronym(List<String> words, String s) {    
        if(words.size()!=s.length()) return false;
        for(int i = 0 ; i< words.size(); i++){    
            String str = words.get(i);
            if(s.charAt(i)!=str.charAt(0)){
                return false;
            }
        }
        return true;
    }
}