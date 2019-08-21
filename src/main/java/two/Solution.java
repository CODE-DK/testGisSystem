package two;

import java.math.BigInteger;

public class Solution {

    private static BigInteger factorial(int x) {
        BigInteger result = BigInteger.valueOf(1L);
        for (int i = 2; i <= x; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    private static BigInteger f(int m, int r) {
        return factorial(m).divide(factorial(r).multiply(factorial(m - r)));
    }

    public static void main(String[] args) {
        int m = 5, r = 3;
        System.out.print(f(m, r));
    }
}
