// Last updated: 7/25/2025, 8:55:17 AM


class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> map; 

        for (int i = 0; i < nums.size(); ++i) {
            int complement = target - nums[i];

            if (map.count(complement)) {
                return {map[complement], i};
            }

            map[nums[i]] = i;
        }

        return {}; 
    }
};
