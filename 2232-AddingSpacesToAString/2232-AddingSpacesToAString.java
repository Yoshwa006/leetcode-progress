// Last updated: 7/25/2025, 8:50:10 AM
class Solution {
    public String addSpaces(String s, int[] spaces) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        char[] res = new char[n+spaces.length];
        int i = 0, idx = 0;
        int pre = 0;
        for (int sp:spaces) {
            while (idx < pre+sp) {
                res[idx++] = arr[i++];
            }
            res[idx++] = ' ';
            pre++;
        }
        while (i < n) {
            res[idx++] = arr[i++];
        }        
        return new String(res);
    }
}