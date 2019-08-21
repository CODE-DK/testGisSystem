package one;

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.println(
                    i % 14 != 0 ? i % 7 != 0 ? i % 2 != 0 ?
                    i : "Two" : "Seven" : "TwoSeven");
        }
    }
}
