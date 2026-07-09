// Last updated: 09/07/2026, 09:46:16
class Solution {
    public String capitalizeTitle(String title) {

        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String w = words[i].toLowerCase();

            if (w.length() <= 2) {
                sb.append(w);
            } else {
                sb.append(Character.toUpperCase(w.charAt(0)))
                  .append(w.substring(1));
            }

            if (i < words.length - 1) sb.append(" ");
        }

        return sb.toString();
    }
}