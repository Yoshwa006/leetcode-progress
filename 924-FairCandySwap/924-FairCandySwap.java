// Last updated: 7/25/2025, 8:52:23 AM
class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        int am = 0;
        int bm = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            am += a[i];
        }

        for (int j = 0; j < b.length; j++) {
            bm += b[j];
        }
        int diff = (am - bm) / 2;


        for(int x :a ){
            set.add(x);
        }
        for(int y :b){
            if(set.contains(y+diff)){
                return(new int[]{y+diff,y});
            }
        }

        return new int[0];
    }

}