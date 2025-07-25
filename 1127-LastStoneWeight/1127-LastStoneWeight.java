// Last updated: 7/25/2025, 8:52:10 AM
class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> qu = new PriorityQueue<>(Comparator.reverseOrder());

        for(int num : arr){
            qu.add(num);
        }

        while(!qu.isEmpty()){
            if(qu.size()== 1){
                return qu.poll();
            }

            int a = qu.poll();
            int b = qu.poll();
            int diff = a -b;

            if(diff>0){
                qu.add(diff);
            }
        }

        return 0;
    }
}