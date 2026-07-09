// Last updated: 09/07/2026, 09:45:38
class Solution {
    public String convertDateToBinary(String date) {

        String[] parts = date.split("-");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {

            int num = Integer.parseInt(parts[i]);
            String bin = Integer.toBinaryString(num);

            sb.append(bin);

            if (i < parts.length - 1) {
                sb.append("-");
            }
        }

        return sb.toString();
    }
}