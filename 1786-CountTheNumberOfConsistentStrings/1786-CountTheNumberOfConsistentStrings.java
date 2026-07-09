// Last updated: 09/07/2026, 09:46:27
class Solution {

    public int countConsistentStrings(String allowed,
                                      String[] words) {

        boolean[] seen = new boolean[26];

        for (char ch : allowed.toCharArray()) {
            seen[ch - 'a'] = true;
        }

        int count = 0;

        for (String word : words) {

            boolean valid = true;

            for (char ch : word.toCharArray()) {

                if (!seen[ch - 'a']) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                count++;
            }
        }

        return count;
    }
}