// Last updated: 7/25/2025, 8:50:14 AM
class Solution {
    public int minimumDeletions(int[] nums) {

        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                minIndex = i;
                min = nums[i];

            }
            if (max < nums[i]) {
                maxIndex = i;
                max = nums[i];

            }
        }

        int largestIndex = -1;
        int smallerIndex = -1;

        if (minIndex > maxIndex) {
            largestIndex = minIndex;
        } else {
            largestIndex = maxIndex;
        }

        if (minIndex < maxIndex) {
            smallerIndex = minIndex;
        } else {
            smallerIndex = maxIndex;
        }

        int len = (smallerIndex + 1) + (nums.length - largestIndex);
        int len1 = (largestIndex + 1);
        int len2 = (nums.length - smallerIndex);

        if (len <= len1 && len <= len2) {
            return len;
        } else if (len1 < len && len1 < len2) {
            return len1;
        } else {
            return len2;
        }

    }
}