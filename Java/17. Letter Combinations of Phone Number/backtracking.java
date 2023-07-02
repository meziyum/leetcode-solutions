
class Solution {
    List<String> ans = new ArrayList<String>();
    String[] map = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return ans;
        }
        backtracking(0, new StringBuilder(), digits);
        return ans;
    }

    public void backtracking(int index, StringBuilder currentString, String digits) {

        if (index==digits.length()) {
            ans.add(currentString.toString());
            return;
        }

        for(int i=0; i< map[(int)digits.charAt(index)-'0'-1].length(); i++) {
            currentString.append(map[(int)digits.charAt(index)-'0'-1].charAt(i));
            backtracking(index+1, currentString, digits);
            currentString.deleteCharAt(currentString.length()-1);
        }
    }
}
