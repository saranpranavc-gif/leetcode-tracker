// Last updated: 09/07/2026, 09:48:26
class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String w = words[i];
            sb.append(new StringBuilder(w).reverse());

            if (i < words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}