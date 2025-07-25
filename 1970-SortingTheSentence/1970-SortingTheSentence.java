// Last updated: 7/25/2025, 8:50:43 AM
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] buc = new String[words.length];

        for( String word : words){
            int i = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
            buc[i] = word.substring(0, word.length()-1);
        }

        return String.join(" ",buc);
    }
}