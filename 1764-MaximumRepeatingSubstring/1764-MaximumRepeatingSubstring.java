// Last updated: 09/07/2026, 09:46:31
class Solution {

    public int maxRepeating(String sequence,
                            String word) {

        int count = 0;

        String temp = word;

        while (sequence.contains(temp)) {

            count++;
            temp += word;
        }

        return count;
    }
}