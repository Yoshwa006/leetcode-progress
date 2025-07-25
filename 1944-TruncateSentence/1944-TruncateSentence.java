// Last updated: 7/25/2025, 8:50:45 AM
class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
StringBuilder ans = new StringBuilder(arr[0]);
        for(int i=1; i<k; i++){
            ans = ans.append(" " +arr[i]);
        }
String f = new String(ans);
        return f;
    }

}