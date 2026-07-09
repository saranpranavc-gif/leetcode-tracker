// Last updated: 09/07/2026, 09:48:11
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        for (int i = 0; i < letters.length; i++) {

            if (letters[i] > target) {
                return letters[i];
            }

        }

        return letters[0];
    }
}