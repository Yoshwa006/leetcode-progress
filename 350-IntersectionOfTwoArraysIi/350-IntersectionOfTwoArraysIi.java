// Last updated: 7/25/2025, 8:53:18 AM
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num) - 1); 
            }
        }


        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
