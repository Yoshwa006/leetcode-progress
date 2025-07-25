// Last updated: 7/25/2025, 8:53:34 AM
class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
        reverseArray(arr);
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] >= i+1){
                continue;
            }
            else{
                return i;
            }
        }

        return n;

    }

    public void reverseArray(int[] array) {
        int start = 0, end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            

            start++;
            end--;
        }
    }
}

