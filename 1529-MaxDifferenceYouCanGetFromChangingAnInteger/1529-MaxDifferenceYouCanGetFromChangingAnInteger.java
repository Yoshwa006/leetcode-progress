// Last updated: 7/25/2025, 8:51:34 AM
class Solution {
    public int maxDiff(int num) {
        String s = String.valueOf(num);
        if (num == 9) {
            return 8;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '9') {
                continue;
            } else {
                s = s.replace(s.charAt(i), '9');
                break;
            }
        }
        int max = Integer.parseInt(s);



///minnn
        s = String.valueOf(num);
        char minReplace = ' ';
        char replaceWith = ' ';

        if (s.charAt(0) != '1') {
            minReplace = s.charAt(0);
            replaceWith = '1';
        } else {
            for (int i = 1; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c != '0' && c != '1') {
                    minReplace = c;
                    replaceWith = '0';
                    break;
                }
            }
        }

        String minStr;
        if (minReplace != ' ') {
            minStr = s.replace(minReplace, replaceWith);
        } else {
            minStr = s;
        }
        int min = Integer.parseInt(minStr);

        return max - min;
    }
}