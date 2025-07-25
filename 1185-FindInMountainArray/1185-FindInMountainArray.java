// Last updated: 7/25/2025, 8:52:03 AM
class Solution {
    public int findInMountainArray(int target, MountainArray m) {
        int n = m.length();
        

        int l = 0, r = n - 1;

        while (l < r) {
            int mid = (l + r) / 2;
            if (m.get(mid) > m.get(mid + 1)) {
                r = mid; 
            } else {
                l = mid + 1;
            }
        }
        


        int peak = l;



        int result = binarySearch(m, target, 0, peak, true);
        if (result != -1) {
            return result;
        }
        return binarySearch(m, target, peak + 1, n - 1, false);
    }





    private int binarySearch(MountainArray m, int target, int l, int r, boolean isIncreasing) {
        while (l <= r) {
            int mid = (l + r) / 2;
            int midValue = m.get(mid);

            if (midValue == target) {
                return mid;
            }

            if (isIncreasing) {
                if (midValue < target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                if (midValue < target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1; 
    }
}
