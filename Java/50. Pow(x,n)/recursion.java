
class Solution {
    public double myPow(double x, int n) {
        return helperPower(x, (long)n);
    }

    private double helperPower(double x, long n) {
        if (n==0) {
            return 1;
        }
       
        if (n<0) {
            return 1.0 / helperPower(x, -1*n);
        }
       
        if (n%2 == 1) {
            return x * helperPower(x*x, (n-1)/2);
        }
        else {
            return helperPower(x*x, n/2);
        }
    }
}