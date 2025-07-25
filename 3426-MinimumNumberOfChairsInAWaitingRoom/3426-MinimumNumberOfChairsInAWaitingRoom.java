// Last updated: 7/25/2025, 8:48:45 AM
class Solution {
    public int minimumChairs(String s) {
        int count =0;
        int max = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == 'E'){
                count++;
            }
            if(count > max){
                max = count;
            }
            else if(s.charAt(i) == 'L'){
                count --;
            }
        }
        return max;
    }
}