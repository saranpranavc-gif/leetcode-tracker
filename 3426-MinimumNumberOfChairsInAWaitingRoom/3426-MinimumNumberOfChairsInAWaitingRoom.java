// Last updated: 09/07/2026, 09:45:57
class Solution {
    public int minimumChairs(String s) {

        int chairs = 0;
        int maxChairs = 0;

        for (char c : s.toCharArray()) {

            if (c == 'E') {
                chairs++;
                maxChairs = Math.max(maxChairs, chairs);
            } else { // 'L'
                chairs--;
            }
        }

        return maxChairs;
    }
}