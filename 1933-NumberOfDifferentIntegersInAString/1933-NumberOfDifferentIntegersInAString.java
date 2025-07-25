// Last updated: 7/25/2025, 8:50:46 AM
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numDifferentIntegers(String s) {
        Set<String> uniqueNumbers = new HashSet<>();
        int n = s.length();
        int i = 0;

        while (i < n) {
            if (Character.isDigit(s.charAt(i))) {
                StringBuilder number = new StringBuilder();

                
                while (i < n && Character.isDigit(s.charAt(i))) {
                    number.append(s.charAt(i));
                    i++;
                }


                String normalized = number.toString().replaceFirst("^0+", "");
                if (normalized.isEmpty()) {
                    normalized = "0";
                }


                uniqueNumbers.add(normalized);
            }
            
            
            
             else {
                i++;
            }

            
        }


        return uniqueNumbers.size();
    }
}
