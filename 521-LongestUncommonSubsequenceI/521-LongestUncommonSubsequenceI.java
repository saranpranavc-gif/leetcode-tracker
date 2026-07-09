// Last updated: 09/07/2026, 09:48:30
class Solution {
    public int findLUSlength(String a, String b) {

        if (a.equals(b)) return -1;

        return Math.max(a.length(), b.length());
    }
}