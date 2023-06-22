
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, r=0, max=0;
        Set<Character> set = new HashSet<Character>();

        while(r<s.length()) {
            char target = s.charAt(r);
            if(set.add(target)) {
                max= Math.max(max, r-l+1);
                r++;
            } else {
                while(s.charAt(l) != target) {
                    set.remove(s.charAt(l)); 
                    l++;
                }
                set.remove(s.charAt(l));
                l++;
            }
        }

        return max;
    }
}
