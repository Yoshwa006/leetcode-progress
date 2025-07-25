// Last updated: 7/25/2025, 8:48:06 AM
class Solution {
    public String generateTag(String caption) {
        String[] words = caption.split(" ");
        StringBuilder sb = new StringBuilder("#");

        boolean first = true;
        for (String word : words) {
            String clean = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (clean.isEmpty()) continue;

            if (first) {
                sb.append(clean);
                first = false;
            } else {
                sb.append(Character.toUpperCase(clean.charAt(0)));
                if (clean.length() > 1) {
                    sb.append(clean.substring(1));
                }
            }

            if (sb.length() >= 100) break;
        }

        return sb.length() > 100 ? sb.substring(0, 100) : sb.toString();
    }
}
