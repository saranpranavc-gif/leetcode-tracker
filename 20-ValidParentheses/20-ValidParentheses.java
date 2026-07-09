// Last updated: 09/07/2026, 09:49:40
class Solution {
    public boolean isValid(String s) {
        while(s.contains("()") || s.contains("{}") || s.contains("[]")){
           s=s.replace("()","");
           s=s.replace("{}","");
           s=s.replace("[]","");
        }
        return s.isEmpty();
        
    }
}
