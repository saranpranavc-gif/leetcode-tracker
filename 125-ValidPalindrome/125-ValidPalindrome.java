// Last updated: 09/07/2026, 09:49:10
class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return false;
        }
        StringBuilder clean=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                clean.append(Character.toLowerCase(c));

            }

        }
        int left =0;
        int right=clean.length()-1;
        while(left<right)
        {
            if(clean.charAt(right)!= clean.charAt(left)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}