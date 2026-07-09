// Last updated: 09/07/2026, 09:45:55
class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        int xor = 0;
        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 2) {
                xor ^= i;
            }
        }

        return xor;
    }
}