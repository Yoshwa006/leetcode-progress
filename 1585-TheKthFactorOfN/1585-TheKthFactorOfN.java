// Last updated: 7/25/2025, 8:51:25 AM
class Solution {
    public int kthFactor(int n, int k) {
        int count =0; 
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;

                if(count == k){
                    return i;
                }
            }
        }

        return -1;
    }
}