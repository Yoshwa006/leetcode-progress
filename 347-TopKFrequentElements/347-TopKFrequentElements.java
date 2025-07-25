// Last updated: 7/25/2025, 8:53:20 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 1) + 1);
        }

        // Step 2: Use a Min-Heap to keep track of top k frequent elements
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> frequencyMap.get(a) - frequencyMap.get(b));
        
        for (int num : frequencyMap.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll(); // Remove the least frequent element
            }
        }

        // Step 3: Extract results from the heap
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }
        return result;
}
}