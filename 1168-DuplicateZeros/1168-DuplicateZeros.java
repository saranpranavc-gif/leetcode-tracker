// Last updated: 09/07/2026, 09:47:29
class Solution {

    public void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == 0) {

                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }

                i++;
            }
        }
    }
}