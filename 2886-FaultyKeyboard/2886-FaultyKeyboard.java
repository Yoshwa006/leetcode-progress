// Last updated: 7/25/2025, 8:49:13 AM
class Solution {
    public String finalString(String s) {
        StringBuilder f =new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'i'){
                f.reverse();
            }
            else{
            f.append(s.charAt(i));
            }
        }
return new String(f);
    }
}