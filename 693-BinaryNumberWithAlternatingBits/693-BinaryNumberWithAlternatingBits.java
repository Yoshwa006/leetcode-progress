// Last updated: 7/25/2025, 8:52:45 AM
class Solution {
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);

        char[] ch = binary.toCharArray();

        for(int i =1; i < ch.length; i++){
            if(ch[i] == ch[i-1]){
                return false;
            }
        }
        return true;
    }
}