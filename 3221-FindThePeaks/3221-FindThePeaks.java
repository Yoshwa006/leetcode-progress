// Last updated: 7/25/2025, 8:49:00 AM
class Solution {
    public List<Integer> findPeaks(int[] arr) {
 List<Integer> list = new ArrayList<>();

        for(int i=1; i< arr.length-1; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
               list.add(i);
        }
        }
        System.gc();
        return list;
    }
}