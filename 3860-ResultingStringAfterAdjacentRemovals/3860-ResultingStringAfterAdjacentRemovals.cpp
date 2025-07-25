// Last updated: 7/25/2025, 8:48:12 AM
class Solution {
public:
    string resultingString(string s) {
        string res = "";

        for (char c : s) {
            if (!res.empty()) {
                char last = res.back();
                if ((c == 'a' && last == 'z') || (c == 'z' && last == 'a') ||
                    c == last + 1 || c == last - 1) {
                    res.pop_back();
                    continue;
                }
            }
            res.push_back(c);
        }
        return res;
    }
};
