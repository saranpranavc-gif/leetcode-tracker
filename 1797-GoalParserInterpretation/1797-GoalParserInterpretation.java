// Last updated: 09/07/2026, 09:46:22
class Solution {

    public String interpret(String command) {

        return command
                .replace("()", "o")
                .replace("(al)", "al");
    }
}