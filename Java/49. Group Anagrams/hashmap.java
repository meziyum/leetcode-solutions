
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for(String word : strs) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String wordValue = String.valueOf(ch);

            if(!map.containsKey(wordValue)) {
                map.put(wordValue, new ArrayList<String>());
            }
            map.get(wordValue).add(word);
        }

        return new ArrayList<>(map.values());
    }
}