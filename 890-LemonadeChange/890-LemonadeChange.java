// Last updated: 7/25/2025, 8:52:27 AM
class Solution {
    public boolean lemonadeChange(int[] arr) {
     int f = 0;
        int t =0;
       for( int num: arr){

           if(num== 5){
               f++;
           }

           if(num== 10){
               t++;
               if(f>0){
                   f--;
               }
               else{
                   return false;
               }
           }

            if(num == 20){
                if(t>0 && f>0){
                    t--;
                    f--;
                    continue;
                }
                else if(t==0 && f>=3){
                    f = f-3;
                    continue;
                }
                else{
                    return false;
                }
            }
            
        }
        return true;
    }
}