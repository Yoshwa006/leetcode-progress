// Last updated: 7/25/2025, 8:55:07 AM
class Solution {
    public int romanToInt(String s) {
         HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V', 5);
        map.put('X',10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D',500);
        map.put('M', 1000);

        char[] ch = s.toCharArray();
        int sum =0;
        for(int i=0; i < ch.length; i++){
            if (i < ch.length - 1 && map.get(ch[i]) < map.get(ch[i + 1])) {
            sum -= map.get(ch[i]); // Subtract current value
        } else {
            sum += map.get(ch[i]); // Add current value
        }
        }

        return sum;
    }
}