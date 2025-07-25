// Last updated: 7/25/2025, 8:50:49 AM
class Solution {
    public boolean squareIsWhite(String co) {
        int c =(int) co.charAt(0);
        int d = (int) co.charAt(1);
        if(c%2 ==0 && d%2 ==0){
            return false;
        }
        else if(c%2 != 0 && d%2 !=0){
            return false;
        }

        return true;
    }
}