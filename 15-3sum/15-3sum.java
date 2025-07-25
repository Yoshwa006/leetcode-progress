// Last updated: 7/25/2025, 8:55:05 AM
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>(); 

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int l = i + 1;
            int r = arr.length - 1;

            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];

                if (sum == 0) {
                    list.add(Arrays.asList(arr[i], arr[l], arr[r]));

                    while (l < r && arr[l] == arr[l + 1]) { 
                        l++;
                    }
                    while (l < r && arr[r] == arr[r - 1]) { 
                        r--;
                    }

                    l++;
                    r--;
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return list;
    }
}
