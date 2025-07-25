// Last updated: 7/25/2025, 8:53:19 AM
class Solution {
    public int[] intersection(int[] arr, int[] num) {
        HashSet<Integer> set =new HashSet<>();


        for( int n : arr){
            set.add(n);
        }
HashSet<Integer> list = new HashSet<>();
        for(int g : num){
            if(set.contains(g)){
                list.add(g);
            }
        }
        int[] array = new int[list.size()];
        int i=0;
for(int h :list){
    array[i] = h;
    i++;
}
return array;
    }
}