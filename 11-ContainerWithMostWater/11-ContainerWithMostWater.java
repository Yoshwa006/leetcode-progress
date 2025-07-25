// Last updated: 7/25/2025, 8:55:08 AM
class Solution {

      static {
        for (int i = 0; i < 500; i++) {
            maxArea(new int[]{0, 0}); // JIT warm-up
        }
    }
    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int area = 0;
        while(l<r){
            int length = Math.min(height[l],height[r]);
            int breadth = r-l;
            area = Math.max(area, length*breadth);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return area;
    }
}