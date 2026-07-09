// Last updated: 09/07/2026, 09:45:32
class Solution {
    public int totalNumbers(int[] digits) {

        boolean[] used = new boolean[1000];
        int n = digits.length;

        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue;

            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    if (digits[k] % 2 != 0) continue;

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    used[num] = true;
                }
            }
        }

        int count = 0;
        for (boolean v : used) {
            if (v) count++;
        }

        return count;
    }
}