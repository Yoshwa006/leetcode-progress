// Last updated: 7/25/2025, 8:49:29 AM
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        String vow="aeiouAEIOU";
        for(int i=left;i<=right;i++){
            String word=words[i];
            char f=word.charAt(0);
            char l=word.charAt(word.length()-1);
            if(vow.indexOf(f)!=-1&&vow.indexOf(l)!=-1)
                count++;
            
        }
        return count;
        
    }
}