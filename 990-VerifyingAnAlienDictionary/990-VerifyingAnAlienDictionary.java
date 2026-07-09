// Last updated: 09/07/2026, 09:47:51
class Solution {

    public boolean isAlienSorted(String[] words, String order) {

        int[] map = new int[26];

        for (int i = 0; i < order.length(); i++) {
            map[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {

            String w1 = words[i];
            String w2 = words[i + 1];

            int len = Math.min(w1.length(), w2.length());

            boolean found = false;

            for (int j = 0; j < len; j++) {

                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);

                if (c1 != c2) {

                    if (map[c1 - 'a'] > map[c2 - 'a']) {
                        return false;
                    }

                    found = true;
                    break;
                }
            }

            if (!found && w1.length() > w2.length()) {
                return false;
            }
        }

        return true;
    }
}