// Last updated: 7/25/2025, 8:51:14 AM
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] c=new char[s.length()];
        for(int i=0;i<indices.length;i++){
           c[indices[i]]=s.charAt(i);
        }
        String newstr=new String(c);
        return newstr;
    }
}