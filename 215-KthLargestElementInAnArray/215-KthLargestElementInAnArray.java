// Last updated: 7/25/2025, 8:53:50 AM
class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
 int n =0;
        for( int num : arr){
            q.add(num);
        }

        int i=0;
        while(i<k && !q.isEmpty()){
            n= q.poll();
            i++;
        }
        
        return n;
    }
}