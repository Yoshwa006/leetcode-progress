// Last updated: 01/03/2026, 22:30:32
class Solution {
public:
    string largestEven(string s) {
        int i = s.size() - 1;
        
        while (i >= 0 && s[i] != '2') {
            i--;
        }
        
        if (i < 0) return "";
        
        return s.substr(0, i + 1);
    }
};