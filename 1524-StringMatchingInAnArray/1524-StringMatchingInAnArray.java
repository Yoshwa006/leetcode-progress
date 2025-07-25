// Last updated: 7/25/2025, 8:51:36 AM
class Solution {
    public List<String> stringMatching(String[] arr) {
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            for(int j =0;j<arr.length; j++){
                if(arr[i].contains(arr[j]) && i!=j){
                    set.add(arr[j]);
                }
            }
        }
        List<String> list = new ArrayList<>();


        for(String s : set){
            list.add(s);
        }

        return list;
        
        }
}