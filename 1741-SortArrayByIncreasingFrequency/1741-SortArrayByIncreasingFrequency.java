// Last updated: 7/25/2025, 8:51:03 AM
class Solution {
    public int[] frequencySort(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : arr){
            map.put(n,map.getOrDefault(n,0) +1);
        }


        List<Integer> list = new ArrayList<>();

        for( int num : arr){
            list.add(num);
        }


        Collections.sort(list, (a,b) ->{
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqA, freqB);
            } else {
                return Integer.compare(b, a);
            }
        });


        for(int i=0; i<arr.length; i++){
            arr[i] = list.get(i);
        }

        return arr;
    }
}