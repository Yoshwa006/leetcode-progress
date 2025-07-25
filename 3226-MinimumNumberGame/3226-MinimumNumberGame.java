// Last updated: 7/25/2025, 8:48:59 AM
class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int[] arr = new int[nums.length];

        for (int num : nums) {
            q.offer(num);
        }
        int i =0;
       while(!q.isEmpty()){
        int a = q.poll();
        int b =q.poll();

        arr[i++] = b;
        arr[i++] = a;
       }
        return arr;

    }
}