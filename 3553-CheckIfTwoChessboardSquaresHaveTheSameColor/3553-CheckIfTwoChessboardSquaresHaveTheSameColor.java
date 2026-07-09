// Last updated: 09/07/2026, 09:45:40
class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        return getColor(coordinate1) == getColor(coordinate2);
    }

    private boolean getColor(String s) {

        int col = s.charAt(0) - 'a';
        int row = s.charAt(1) - '1';

        return (col + row) % 2 == 0;
    }
}