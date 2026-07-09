// Last updated: 09/07/2026, 09:46:42
class Solution {
    public String reorderSpaces(String text) {

        int spaceCount = 0;
        String[] words = text.trim().split("\\s+");

        for (char c : text.toCharArray()) {
            if (c == ' ') spaceCount++;
        }

        if (words.length == 1) {
            return words[0] + " ".repeat(spaceCount);
        }

        int gaps = words.length - 1;
        int spaceBetween = spaceCount / gaps;
        int extra = spaceCount % gaps;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i < words.length - 1) {
                sb.append(" ".repeat(spaceBetween));
            }
        }

        sb.append(" ".repeat(extra));

        return sb.toString();
    }
}