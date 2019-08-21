package two;

public class Solution {

    private static int factorial(int x) {
        int result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    private static int f(int m, int r) {
        return factorial(m) / factorial(r) * factorial(m - r);
    }

    public static void main(String[] args) {
        int m = 5, r = 3;
        System.out.print(f(m, r));
    }
}
