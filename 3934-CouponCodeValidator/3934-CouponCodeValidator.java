// Last updated: 7/25/2025, 8:48:00 AM
import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        
        Map<String, Integer> businessPriority = new HashMap<>();
        businessPriority.put("electronics", 0);
        businessPriority.put("grocery", 1);
        businessPriority.put("pharmacy", 2);
        businessPriority.put("restaurant", 3);

       
        List<Coupon> validCoupons = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {
            String c = code[i];
            String b = businessLine[i];
            boolean active = isActive[i];

            if (!active) continue;
            if (c == null || c.isEmpty()) continue;
            if (!c.matches("^[a-zA-Z0-9_]+$")) continue;
            if (!businessPriority.containsKey(b)) continue;

            validCoupons.add(new Coupon(c, b));
        }

       
        validCoupons.sort((a, b) -> {
            int cmp = Integer.compare(businessPriority.get(a.businessLine), businessPriority.get(b.businessLine));
            return cmp != 0 ? cmp : a.code.compareTo(b.code);
        });

      
        List<String> result = new ArrayList<>();
        for (Coupon coupon : validCoupons) {
            result.add(coupon.code);
        }

        return result;
    }


    static class Coupon {
        String code;
        String businessLine;

        Coupon(String code, String businessLine) {
            this.code = code;
            this.businessLine = businessLine;
        }
    }
}
