// Last updated: 09/07/2026, 09:48:53
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        char[] ch1 = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if(Arrays.equals(ch,ch1)){
           return true;
        } else{
           return false;
        }

        

    }    
} 
    
