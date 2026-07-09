// Last updated: 09/07/2026, 09:49:27
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append((char) ('0' + (sum % 2)));
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }
}
