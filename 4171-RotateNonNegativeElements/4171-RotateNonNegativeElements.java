// Last updated: 01/03/2026, 22:30:29
class Solution {
    public int[] rotateElements(int[] nums, int k) {
        if (nums.length < 2) return nums;
        return rotateByK(nums, k);
    }

    public int[] rotateByK(int[] arr, int k) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                list.add(arr[i]);
            }
        }

        int p = list.size();
        if (p <= 1) return arr;

        int shift = k % p;
        int pos = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                arr[i] = list.get((pos + shift) % p);
                pos++;
            }
        }

        return arr;
    }
}
