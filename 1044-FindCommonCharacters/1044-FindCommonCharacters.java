// Last updated: 09/07/2026, 09:47:46
class Solution {
    public List<String> commonChars(String[] words) {

        List<String> ans = new ArrayList<>();

        String first = words[0];

        for(int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);
            boolean common = true;

            for(int j = 1; j < words.length; j++) {

                int index = words[j].indexOf(ch);

                if(index == -1) {
                    common = false;
                    break;
                }

                words[j] = words[j].substring(0, index) + 
                           words[j].substring(index + 1);
            }

            if(common) {
                ans.add("" + ch);
            }
        }

        return ans;
    }
}