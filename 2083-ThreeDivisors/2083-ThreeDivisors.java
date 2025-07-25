// Last updated: 7/25/2025, 8:50:30 AM
class Solution {
    public boolean isThree(int n) {
        int k =1;
        int count = 0;

        while(k<=n){
            if(n%k ==0){
                count++;
            }
            k++;
        }
        if(count == 3){
                return true;
            }

        return false;
    }
}