// Last updated: 09/07/2026, 09:47:11
class Solution {
    public String reformat(String s) {

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                letters.append(ch);
            }
        }

        if (Math.abs(digits.length() - letters.length()) > 1)
            return "";

        boolean digitTurn = digits.length() >= letters.length();

        StringBuilder res = new StringBuilder();

        int i = 0, j = 0;

        while (i < digits.length() || j < letters.length()) {

            if (digitTurn && i < digits.length()) {
                res.append(digits.charAt(i++));
            } else if (!digitTurn && j < letters.length()) {
                res.append(letters.charAt(j++));
            }

            digitTurn = !digitTurn;
        }

        return res.toString();
    }
}