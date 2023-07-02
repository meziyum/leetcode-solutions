
class Solution {
    int ans;
    int[] buildingChange;

    public int maximumRequests(int n, int[][] requests) {
        buildingChange = new int[n];
        backtrack(0, 0, n, requests);
        return ans;
    }

    public void backtrack(int index, int successCount, int n, int[][]requests) {

        if (index == requests.length) {
            for(int i=0; i< n; i++) {
                if(buildingChange[i] != 0) return;
            }

            ans= Math.max(ans, successCount);
            return;
        }

        //Move to the next Request
        buildingChange[requests[index][0]]--;
        buildingChange[requests[index][1]]++;
        backtrack(index+1, successCount+1, n, requests);

        //BackTrack
        buildingChange[requests[index][0]]++;
        buildingChange[requests[index][1]]--;
        

        backtrack(index+1, successCount, n, requests);
    }
}
