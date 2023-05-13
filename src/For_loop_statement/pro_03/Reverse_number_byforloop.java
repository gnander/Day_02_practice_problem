package For_loop_statement.pro_03;

import java.util.Scanner;

public class Reverse_number_byforloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, reversed = 0;
        System.out.print("Enter a positive integer: ");
        n = input.nextInt();

        for (; n != 0; n /= 10) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("The reversed number is: " + reversed);
    }
}
