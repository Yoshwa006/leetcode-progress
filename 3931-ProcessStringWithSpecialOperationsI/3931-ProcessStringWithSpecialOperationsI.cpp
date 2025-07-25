// Last updated: 7/25/2025, 8:47:58 AM
class Solution {
public:
    string processStr(string s) {
        string result;

        for (char c : s) {
            if (c <= 'z' && c >= 'a') {
                result += c;
            } else if (c == '*') {
                if (!result.empty()) {
                    result.pop_back();
                }
            } else if (c == '#') {
                result += result;
            } else if (c == '%') {
                reverse(result.begin(), result.end());
            }
        }

        return result;
    }
};