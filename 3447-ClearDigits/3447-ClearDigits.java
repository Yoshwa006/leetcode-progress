// Last updated: 7/25/2025, 8:48:42 AM
class Solution {
    public String clearDigits(String s) {
        StringBuilder sb= new StringBuilder(s);
        
        for(int i=0; i<sb.length(); i++){
            int chrIdx=sb.charAt(i)-'0';
            if(chrIdx>=0 && chrIdx<=9){ 
                sb=sb.delete(i-1, i+1); 
                i-=2; 
            }
        }

        return sb.toString(); 
    }
}