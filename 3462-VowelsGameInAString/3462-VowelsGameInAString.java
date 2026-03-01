// Last updated: 01/03/2026, 22:31:09
class Solution {
    public boolean doesAliceWin(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'a','e','i','o','u':
                    return true;
            }
        }

        return false;
    }
}