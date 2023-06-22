
class Solution {
    public double myPow(double x, int n) {
        return binaryExp(x, (long)n);
    }

    private double binaryExp(double x, long n) {
        long power = (long)n;
        if (power == 0) {
            return 1;
        }

        if (power < 0) {
            power = -1 * n;
            x = 1.0/x;
        }

        double result = 1;
        while (power != 0) {
            if (power%2 == 1) {
                result = result*x;
                power-=1;
            } else {
                x=x*x;
                power/=2;
            }
        }
        return result;
    }
}
