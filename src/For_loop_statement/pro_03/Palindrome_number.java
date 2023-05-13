package For_loop_statement.pro_03;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, reversedNumber = 0;
        System.out.print("Enter a positive integer: ");
        n = input.nextInt();

        for (int i = n; i != 0; i /= 10) {
            int digit = i % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        if (n == reversedNumber) {
            System.out.println(n + " then it is a palindrome.");
        } else {
            System.out.println(n + " then it is not a palindrome.");
        }
    }

}
