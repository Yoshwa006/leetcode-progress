// Last updated: 7/25/2025, 8:51:42 AM
class Solution {
    public int maximum69Number(int n) {
        String num = Integer.toString(n);
        int[] arr = new int[num.length()];

        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i) - '0';
        }

        for( int i=0; i<arr.length; i++){
            if(arr[i] == 6){
                arr[i] = 9;
                break;
            }
        }
int nums = 0;

for( int hn: arr){
    nums =(nums*10)+hn;
}
return nums;
    }
}