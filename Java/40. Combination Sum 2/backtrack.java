
class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    List<Integer> currentList= new ArrayList<Integer>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, target, 0);        
        return ans;
    }

    public void backtrack(int[]candidates, int target, int start) {

        if(target==0){
            ans.add(new ArrayList<>(currentList));
            return;
        }

        for(int i=start; i<candidates.length; i++) {

            if(i>start && candidates[i-1]==candidates[i]) {
                continue;
            }

            if(candidates[i]<=target) {
                currentList.add(candidates[i]);
                backtrack(candidates, target-candidates[i], i+1);
                currentList.remove(currentList.size()-1);
            }
        }
    }
}
