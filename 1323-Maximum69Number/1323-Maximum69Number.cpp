// Last updated: 8/16/2025, 7:50:20 AM
class Solution {
public:
    int maximum69Number (int num) {
        string s = to_string(num);


       for(int i=0; i<s.size(); i++){
        if(s[i] == '6'){
            s[i] = '9';
            break;
        }
       }

       return stoi(s);
    }
};