// Last updated: 09/07/2026, 09:48:43
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        char[] arr = magazine.toCharArray();

        for (int i = 0; i < ransomNote.length(); i++) {

            boolean found = false;

            for (int j = 0; j < arr.length; j++) {

                if (ransomNote.charAt(i) == arr[j]) {

                    found = true;
                    arr[j] = '#';
                    break;

                }

            }

            if (!found) {
                return false;
            }

        }

        return true;
    }
}