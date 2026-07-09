// Last updated: 09/07/2026, 09:48:14
class Solution {
    public boolean checkValidString(String s) {
        int low = 0, high = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                low++;
                high++;
            } else if (c == ')') {
                low = Math.max(low - 1, 0);
                high--;
            } else { // '*'
                low = Math.max(low - 1, 0);
                high++;
            }
            if (high < 0) return false;
        }
        return low == 0;
    }
}
