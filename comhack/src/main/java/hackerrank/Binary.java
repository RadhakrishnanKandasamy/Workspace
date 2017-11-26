package hackerrank;

import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer input = scan.nextInt();
        System.out.println(Integer.toString(input, 2));
        System.out.println(count(input.toString(input, 2)));
        scan.close();
    }

    /**
     * This method is used to count the number of maximum 1's in the converted string
     *
     * @param input
     * @return
     */
    public static int count(String input) {
        int count = 0;
        for (int i = 0, temp = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            if (c == '1') {
                temp++;
                if (temp >= count)
                    count = temp;
            } else
                temp = 0;
        }
        return count;
    }
}
