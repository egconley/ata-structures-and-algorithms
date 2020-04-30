package code401challenges;

public class betterFibonacci {
    public int betterFibonacci(int n) {

        int fibn = 0;

        if (n==1) {
            fibn = 1;
        } else if (n>=2) {
            int fibn_2 = 0;
            int fibn_1 = 1;
            fibn = fibn_1 + fibn_2;
            for (int i=3; i<=n; i++) {
                fibn_2 = fibn_1;
                fibn_1 = fibn;
                fibn = fibn_1 + fibn_2;
            }
        }

        return fibn;
    }
}
