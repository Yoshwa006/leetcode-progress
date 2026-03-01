// Last updated: 01/03/2026, 22:30:34
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
           int[] count = new int[101];

        for (int x : bulbs) {
              count[x]++;
        }

        List<Integer> r = new ArrayList<>();
        for (int i = 1; i   <= 100; i++) {
            if (count[i] % 2 == 1) {
                   r.add(i);
              }
        }
          return r;
    }
}
