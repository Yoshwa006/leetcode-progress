// Last updated: 7/25/2025, 8:49:03 AM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<words.length;i++){
            String temp = String.valueOf(x);
            if(words[i].contains(temp)){
                list.add(i);
            }
        }
        return list;
    }
}