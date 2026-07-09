// Last updated: 09/07/2026, 09:46:20
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
        return false;
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
                return false;
            }
        }
        return true;
        
    }
}