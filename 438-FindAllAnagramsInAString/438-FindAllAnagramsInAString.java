// Last updated: 7/25/2025, 8:53:08 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(p.length()  >s.length()){
            return new ArrayList<>();
        }
       

        int[] fp = new int[26];
        int[] fs = new int[26];

        for(int i =0; i<p.length(); i++){
            fp[p.charAt(i) -'a']++;
            fs[s.charAt(i) -'a']++;
        }

        if(Arrays.equals(fp,fs)){
            list.add(0);
        }

        int start =0 , end = p.length();

        while(end < s.length()){
            fs[s.charAt(start)- 'a']--;
            fs[s.charAt(end)- 'a']++;

            if(Arrays.equals(fs,fp)){
                list.add(start+1);
            }

            start++;
            end++;
        }

        return list;
    }
}