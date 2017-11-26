package hackerrank;

import java.util.Scanner;

public class BiggestOfArray {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int temp = 0;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int element = ar[i];
            if (element >= temp) {
                if (element != temp) counter = 0;
                temp = ar[i];
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}





