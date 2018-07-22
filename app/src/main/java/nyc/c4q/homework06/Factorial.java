package nyc.c4q.homework06;

/**
 * Created by joannesong on 10/28/17.
 */

public class Factorial {
    public int factorial(int n) {
        if (n == 0)
            return 1;
        else {
            return (n * factorial(n - 1));
            }
        }
}
