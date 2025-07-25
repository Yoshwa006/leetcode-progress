// Last updated: 7/25/2025, 8:52:55 AM
class Solution {
    public String reverseWords(String s) {
      String[] str = s.split(" ");
      StringBuilder sb = new StringBuilder();
      for(String w : str){
        StringBuilder sb1 = new StringBuilder(w);
        sb.append(sb1.reverse().toString());
        sb.append(" ");
      }
      return sb.toString().trim();  
    }
}