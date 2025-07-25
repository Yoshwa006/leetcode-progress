// Last updated: 7/25/2025, 8:52:31 AM
import java.util.*;

class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int total = 0;


        for (int ans : answers) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey();         
            int count = entry.getValue();  

            int groupSize = k + 1;
            int groups = (int) Math.ceil((double) count / groupSize);

            total += groups * groupSize;
        }

        return total;
    }
}
