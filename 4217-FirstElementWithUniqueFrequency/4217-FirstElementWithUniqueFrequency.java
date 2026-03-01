// Last updated: 01/03/2026, 22:30:33
import java.util.*;

class Solution {
    public int firstUniqueFreq(int[] nums) {

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> frequencyCount = new HashMap<>();
        for (int freq : frequency.values()) {
            frequencyCount.put(freq, frequencyCount.getOrDefault(freq, 0) + 1);
        }

        for (int num : nums) {
            int freq = frequency.get(num);
            if (frequencyCount.get(freq) == 1) {
                return num;
            }
        }

        return -1;
    }
}
