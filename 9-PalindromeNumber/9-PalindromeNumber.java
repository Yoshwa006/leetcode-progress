// Last updated: 7/25/2025, 8:55:11 AM
class Solution {
    public boolean isPalindrome(int x) {
        int y =x;
        int res=0,rem;
if(x<0 ){
    return false;
}

if(x>=0 && x <=9){
    return true;
}
        while(x!=0){
            rem = x%10;
            res = (res *10) +rem;
            x/=10;
        }

        if(y==res){
            return true;
        }
        return false;
    }
}