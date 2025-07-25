// Last updated: 7/25/2025, 8:50:29 AM
class Solution {
    public int minStoneSum(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue(Collections.reverseOrder());

        for( int num : arr){
            heap.add(num);
        }

        for(int i=0; i<k; i++){
            int pop = heap.poll();
            pop -= pop/2;
            heap.add(pop);
        }
        int sum =0;
        while(!heap.isEmpty()){
            sum += heap.poll();
        }

        return sum;
}
}