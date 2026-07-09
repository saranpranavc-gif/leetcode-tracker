// Last updated: 09/07/2026, 09:49:00
class Solution {
    public boolean isIsomorphic(String s, String t) {

        char[] map1 = new char[256];
        char[] map2 = new char[256];

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map1[ch1] == 0 && map2[ch2] == 0) {

                map1[ch1] = ch2;
                map2[ch2] = ch1;

            }
            else if (map1[ch1] != ch2 || map2[ch2] != ch1) {

                return false;

            }
        }

        return true;
    }
}