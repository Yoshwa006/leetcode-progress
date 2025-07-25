// Last updated: 7/25/2025, 8:50:18 AM
class Solution {
    public int minimumMoves(String s) {
        int i=0;
        int m=0;


        while(i<s.length()){
            if(s.charAt(i) == 'X'){
                i+=3;
                m++;
            }
            else{
                i++;
            }
        }
        return m;
    }
}
