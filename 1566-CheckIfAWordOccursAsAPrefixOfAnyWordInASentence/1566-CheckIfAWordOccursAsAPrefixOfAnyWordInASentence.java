// Last updated: 09/07/2026, 09:47:03
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }
}