// Last updated: 09/07/2026, 09:47:39
class Solution {

    public int countCharacters(String[] words, String chars) {

        int[] base = new int[26];

        for (char ch : chars.toCharArray()) {
            base[ch - 'a']++;
        }

        int sum = 0;

        for (String word : words) {

            int[] temp = new int[26];
            boolean valid = true;

            for (char ch : word.toCharArray()) {

                temp[ch - 'a']++;

                if (temp[ch - 'a'] > base[ch - 'a']) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                sum += word.length();
            }
        }

        return sum;
    }
}