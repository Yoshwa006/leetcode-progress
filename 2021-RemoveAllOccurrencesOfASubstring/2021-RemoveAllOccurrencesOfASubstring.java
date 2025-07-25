// Last updated: 7/25/2025, 8:50:38 AM
class Solution {
    public String removeOccurrences(String s, String t) {
         int index = s.indexOf(t);
        

        if (index == -1) {
            return s;
        }


        String updatedStr = s.substring(0, index) + s.substring(index + t.length());


        return removeOccurrences(updatedStr, t);
    }
}