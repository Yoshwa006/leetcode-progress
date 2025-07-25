// Last updated: 7/25/2025, 8:53:00 AM
class Solution {
    public int[] nextGreaterElement(int[] arr, int[] arr2) {
        int n = arr.length;
        int[] ans = new int[arr.length];
        Arrays.fill(ans, -1);
        for(int i =0; i<n; i++){
            int key = arr[i];
            for(int j =0;j<arr2.length; j++){
                if(arr2[j] == key){
                   for(int k = j; k<arr2.length; k++){
                    if(arr2[k] > key){
                        ans[i]  = arr2[k];
                        break;
                    }
                   }
                }
            }
        }

        return ans;
    }
}