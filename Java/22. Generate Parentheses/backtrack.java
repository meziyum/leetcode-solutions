
class Solution {
    List<String> ans = new ArrayList<String>();
    
    public List<String> generateParenthesis(int n) {
        backtracking(0, new StringBuilder(), n, 0, 0);
        return ans;
    }

    public void backtracking(int index, StringBuilder currentString, int n, int openCount, int closeCount) {

        if (index==n*2) {
            ans.add(currentString.toString());
            return;
        }

        if (openCount<n) {
            currentString.append('(');
            backtracking(index+1, currentString, n, openCount+1, closeCount);
            currentString.deleteCharAt(currentString.length()-1);
        }

        if (openCount>closeCount) {
            currentString.append(')');
            backtracking(index+1, currentString, n, openCount, closeCount+1);
            currentString.deleteCharAt(currentString.length()-1);
        }

        
    }
}
