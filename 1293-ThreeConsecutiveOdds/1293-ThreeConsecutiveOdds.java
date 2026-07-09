// Last updated: 09/07/2026, 09:47:22
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        int count = 0;

        for (int num : arr) {

            if (num % 2 != 0) {
                count++;
                if (count == 3) return true;
            } else {
                count = 0;
            }
        }

        return false;
    }
}