// Last updated: 7/25/2025, 8:49:22 AM
import java.util.Arrays;

class Solution {
    public int buyChoco(int[] arr, int money) {
        Arrays.sort(arr); 


        int totalCost = arr[0] + arr[1];
        

        if (totalCost <= money) {
            return money - totalCost;
        }
        

        return money;
    }
}
