// Last updated: 01/03/2026, 22:30:30
class Solution {
    public int countMonobit(int n) {

        int count = 0;

        for(int i = 0; i <= n; i++){
            if(checkThis(i)){
                count++;
            }
        }

        return count;
    }

    boolean checkThis(int n)
    {
        if(n == 0) return true;

        int last = n & 1;

        while(n > 0)
        {
            if((n & 1) != last)
                return false;

            n = n >> 1;
        }

        return true;
    }
}
