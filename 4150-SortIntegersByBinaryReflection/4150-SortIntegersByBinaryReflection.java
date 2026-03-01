// Last updated: 01/03/2026, 22:30:36
import java.util.*;

class Solution {
    public int[] sortByReflection(int[] nums) {
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {
            int ra = rev(a);
            int rb = rev(b);
            if (ra != rb) return ra - rb;
            return a - b;
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }

    int rev(int n) {
        int x = 0;
        while (n > 0) {
            x = x * 2 + (n & 1);
            n >>= 1;
        }
        return x;
    }
}
