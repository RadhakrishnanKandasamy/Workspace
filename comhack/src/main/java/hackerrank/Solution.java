package hackerrank;

import java.util.Scanner;


public class Solution {
    public static int sum = 1;

    static int factorial(int n) {
        // Complete this function
        if (n == 1) {
            System.out.println(n);
            return n;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int result = factorial(n);
        System.out.println(result);
    }
}
