// Last updated: 7/25/2025, 8:49:27 AM
class Solution {
    public long pickGifts(int[] arr, int k) {
         PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            heap.add(num);
        }

        for (int j = 0; j < k ; j++) {
            int pol = heap.poll();

            int ans = (int) Math.floor(Math.sqrt(pol));

            heap.add(ans);
        }
        int index = 0;
        long sum = 0;
        while (!heap.isEmpty()) {
            arr[index++] = heap.poll();
        }

        for( int i : arr){
            sum = sum + i;
        }
        return sum;
    }
    }