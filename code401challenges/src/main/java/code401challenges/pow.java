package code401challenges;

public class pow {
    // Write a method - pow(x,n) that returns the value of x raised to the power of n (xn). n can be negative!
    public double pow(double x, int n) {
        double answer = 1;
        if (n<0) {
            int posn = Math.abs(n);
            for (int i=1; i<=posn; i++) {
                answer = 1/(answer*x);
            }
        } else {
            for (int i=1; i<=n; i++) {
                answer = answer*x;
            }
        }

        return answer;
    }
}
