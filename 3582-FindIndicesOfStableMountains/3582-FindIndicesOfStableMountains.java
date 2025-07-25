// Last updated: 7/25/2025, 8:48:32 AM
class Solution {
    public List<Integer> stableMountains(int[] arr, int t) {
        List<Integer> list = new ArrayList<>();

        int n = arr.length;
        for(int i =0; i<n-1; i++){
            if(arr[i] > t){
                list.add(i+1);
            }
        }


        return list;
    }
}