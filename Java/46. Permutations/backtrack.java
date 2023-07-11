
class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> permute(int[] nums) {
        backtracking(0, nums);
        return ans;
    }

    public void backtracking(int index, int[] nums) {

        if (index==nums.length) {
            List<Integer> temp = new ArrayList<Integer>();
            for(int i=0; i<nums.length; i++) {
                temp.add(nums[i]);
            }
            ans.add(new ArrayList<Integer>(temp));
            return;
        }

        for(int i=index; i<nums.length; i++) {
            swap(nums, index, i);
            backtracking(index+1, nums);
            swap(nums, index, i);
        }
    }

    public void swap(int[]nums, int x, int y) {
        int temp = nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}
