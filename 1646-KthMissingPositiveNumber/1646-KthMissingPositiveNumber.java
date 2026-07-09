// Last updated: 09/07/2026, 09:46:49
class Solution {
    public int findKthPositive(int[] arr, int k) {

        int missing = 0;
        int num = 1;
        int i = 0;

        while (true) {

            if (i < arr.length && arr[i] == num) {
                i++;
            } else {
                missing++;
                if (missing == k) {
                    return num;
                }
            }

            num++;
        }
    }
}