// Last updated: 09/07/2026, 09:48:08
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] a = s1.split(" ");
        String[] b = s2.split(" ");

        for (String word : a) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : b) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>();

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                list.add(key);
            }
        }

        return list.toArray(new String[0]);
    }
}