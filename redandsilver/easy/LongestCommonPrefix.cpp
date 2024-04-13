class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string answer = "";
        // sort
        sort(strs.begin(),strs.end());
        int n = strs.size();
        string first = strs[0], last = strs[n-1];
        int len = min(first.size(), last.size());

        for(int i=0; i<len; i++){
            if(first[i] != last[i]){
                return answer;
            }
            answer+=first[i];
        }
        return answer;
    }
};