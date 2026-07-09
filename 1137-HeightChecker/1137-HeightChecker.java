// Last updated: 09/07/2026, 09:47:33
class Solution {

    public int heightChecker(int[] heights) {

        int[] expected = heights.clone();

        Arrays.sort(expected);

        int count = 0;

        for (int i = 0; i < heights.length; i++) {

            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}