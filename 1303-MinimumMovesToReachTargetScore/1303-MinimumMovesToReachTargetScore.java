// Last updated: 7/25/2025, 8:51:52 AM
class Solution {
    public int minMoves(int target, int maxDoubles) {
        int count = 0;
        while(maxDoubles>0){
            if(target == 1)
                return count;
            if(target%2 == 0){
                target = target/2;
                maxDoubles--;
                count++;
            }
            else{
                target--;
                count++;
            }
            
        }
        count+= target -1;
        return count;
    }
}