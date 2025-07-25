// Last updated: 7/25/2025, 8:53:11 AM
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        int k = 1;
        while (k <= n) {
            if (k % 3 == 0 && k % 5 == 0) {
                list.add("FizzBuzz");
            } else if (k % 3 == 0) {
                list.add("Fizz");
            } else if (k % 5 == 0) {
                list.add("Buzz");
            } else {
                String s = String.valueOf(k);
                list.add(s);
            }
            k++;
        }
        return list;
    }
}