// Last updated: 7/25/2025, 8:53:06 AM
class Solution {
public:
    int compress(vector<char>& ch) {
        int n = ch.size();
        int idx = 0; 

        for (int i = 0; i < n;) {
            char current = ch[i];
            int count = 0;
            while (i < n && ch[i] == current) {
                i++;
                count++;
            }
            ch[idx++] = current;
            if (count > 1) {
                string scount = to_string(count);
                for (char c : scount) {
                    ch[idx++] = c;
                }
            }
        }
        return idx;
    }
};
