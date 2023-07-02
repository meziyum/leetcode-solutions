
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ans=0;

        for(int i: nums) {
            int count = map.getOrDefault(i, 0);
            ans+=count;
            map.put(i, count+1);
        }
        
        return ans;
    }
}
