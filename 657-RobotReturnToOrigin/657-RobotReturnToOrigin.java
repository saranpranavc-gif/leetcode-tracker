// Last updated: 09/07/2026, 09:48:17
class Solution {
    public boolean judgeCircle(String moves) {

        int x = 0, y = 0;

        for (char c : moves.toCharArray()) {

            if (c == 'U') y++;
            else if (c == 'D') y--;
            else if (c == 'L') x--;
            else if (c == 'R') x++;
        }

        return x == 0 && y == 0;
    }
}