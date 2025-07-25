// Last updated: 7/25/2025, 8:49:48 AM
class Solution {
public:
    int matchPlayersAndTrainers(vector<int>& players, vector<int>& trainers) {
     sort(players.begin(), players.end());
        sort(trainers.begin(), trainers.end());

        int i = 0; 
        int j = 0; 
        int count = 0;

        while (i < players.size() && j < trainers.size()) {
            if (trainers[j] >= players[i]) {
                count++;
                i++;
                j++;
            } else {
                j++; 
            }
        }

        return count;
    }   
};