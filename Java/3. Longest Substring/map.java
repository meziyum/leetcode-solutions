
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, r=0, max=0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        while(r<s.length()) {
            char target = s.charAt(r);
            if(map.containsKey(target)) {
                l=Math.max(map.get(target)+1, l);
            }
            map.put(target, r);
            max = Math.max(max, r-l+1);
            r++;
        }

        return max;
    }
}
