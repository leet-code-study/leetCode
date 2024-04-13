class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> map;
        int n = nums.size();

        for(int i=0; i<n; i++){
            map[nums[i]] = i;
        }

        for(int i=0; i<n; i++){
            int val = target - nums[i];
            if(map.count(val) && map[val] != i){
                return {i,map[val]};
            }
        }
        return {};
    }
};