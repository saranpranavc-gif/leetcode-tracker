// Last updated: 09/07/2026, 09:49:29
class Solution {
    public int lengthOfLastWord(String s) {
        String[] words= s.trim().split(" ");

        return words[words.length-1].length();
        
    }
}