// Last updated: 7/25/2025, 8:48:25 AM
class Solution {
    public int buttonWithLongestTime(int[][] arr) {

        int max= arr[0][1];
        int button = arr[0][0];

        for( int i=1; i<arr.length; i++){
            int timetaken = arr[i][1] - arr[i-1][1];
        
        if(timetaken > max || timetaken == max && arr[i][0] < button){
            max = timetaken;
            button = arr[i][0];
        }
        
        }

        return button;
}
}