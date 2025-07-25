// Last updated: 7/25/2025, 8:49:25 AM
class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);


        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != '9'){
                s = s.replace(s.charAt(i) , '9');
                break;
            }
        }
        int max = Integer.parseInt(s);
        s = String.valueOf(num);


        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != '0'){
                s = s.replace(s.charAt(i) , '0');
                break;
            }
        }

    int min = Integer.parseInt(s);

    return max - min;
    }
}