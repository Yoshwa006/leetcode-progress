// Last updated: 7/25/2025, 8:48:07 AM
using namespace std;
const int MOD = 1e9 + 7;

class Solution {
public:
    int countTrapezoids(vector<vector<int>>& points) {
        unordered_map<int, int> y_count;
        for (auto& p : points) {
            y_count[p[1]]++;
        }

        vector<long long> combs;
        for (auto& [y, cnt] : y_count) {
            if (cnt >= 2) {
                combs.push_back(1LL * cnt * (cnt - 1) / 2);
            }
        }

        int sz = combs.size();
        vector<long long> prefix(sz + 1, 0);
        for (int i = 0; i < sz; i++) {
            prefix[i + 1] = (prefix[i] + combs[i]) % MOD;
        }

        long long result = 0;
        for (int i = 0; i < sz; i++) {
            long long after = (prefix[sz] - prefix[i + 1] + MOD) % MOD;
            result = (result + combs[i] * after % MOD) % MOD;
        }

        return result;
    }
};
