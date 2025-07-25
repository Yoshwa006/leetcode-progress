// Last updated: 7/25/2025, 8:52:00 AM
class Solution {
    public int findSpecialInteger(int[] arr) {
        int n= arr.length;
        int j= n/4;
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == arr[j])
            {
                ans = arr[i];
                break;
            } 
            else j++;
        }
        return ans;
    }
}