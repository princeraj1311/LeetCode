class Solution {
public:
    int maxDepth(string s) {
        
        int start = 0;
        int result = 0;
        for(char c : s){
            start = start + (c=='(') - (c==')');
            result = max(start , result);
        }
        return result;
    }
};