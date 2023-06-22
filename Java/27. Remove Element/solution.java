
class Solution {
    public int removeElement(int[] nums, int val) {
        int counterVal = 0;
        for(int i = 0; i < nums.length; i++) {
            nums[i - counterVal] = nums[i];
            if (nums[i] == val)
                counterVal++;
        }
        return nums.length - counterVal;
    }
}
