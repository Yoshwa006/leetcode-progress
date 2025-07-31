// Last updated: 7/31/2025, 8:12:53 PM


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
