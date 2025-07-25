// Last updated: 7/25/2025, 8:49:18 AM
class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> set = new HashSet<>();

        for(int i =0; i<s.length(); i++){
            set.add(s.charAt(i));
        }

        return set.size();
    }
}