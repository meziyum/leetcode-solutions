
class Solution {
    int minUnfairness;
    int count[];

    public int distributeCookies(int[] cookies, int k) {
        minUnfairness = Integer.MAX_VALUE;
        count = new int[k];
        backtrack(0, cookies, k);
        return minUnfairness;
    }

    public void backtrack(int cookiesIndex, int[] cookies, int k) { //Backtracking Recursion

        if(cookiesIndex == cookies.length) { //If the cookiesIndex is out of bound
            int maxCookies=0;
            for(int i=0; i<k; i++) { // Find the Child with Maximum Cookies
                maxCookies=Math.max(maxCookies, count[i]);
            }
            //See if the Current Max is the Min Unfair or not and update 
            minUnfairness= Math.min(minUnfairness, maxCookies);
            return;
        }

        for(int i=0; i<k; i++) {
            count[i] += cookies[cookiesIndex];
            backtrack(cookiesIndex+1, cookies, k); //Move to the next cookieIndex
            count[i]-=cookies[cookiesIndex];
            if(count[i] == 0) {
                break;
            }
        }
    }
}
