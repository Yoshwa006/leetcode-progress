// Last updated: 7/25/2025, 8:52:01 AM
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int sum =0;
        int n =  (int) ((0.05) * arr.length);

        for(int i =n; i<arr.length -n; i++){
            sum += arr[i];
        }
        return (double) sum/(arr.length - (2*n));
    }
}