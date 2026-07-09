// Last updated: 09/07/2026, 09:46:18
class Solution {
    public int mostWordsFound(String[] sentences) {

        int max = 0;

        for (String s : sentences) {

            int count = 1;

            for (char c : s.toCharArray()) {
                if (c == ' ') count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}