// Last updated: 09/07/2026, 09:45:51
import java.util.*;

class Solution {
    public String clearDigits(String s) {

        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                if (stack.length() > 0) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                stack.append(c);
            }
        }

        return stack.toString();
    }
}