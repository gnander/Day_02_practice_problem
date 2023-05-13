package If_else_statement.pro_01;

import java.util.Scanner;

public class Display_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1, 10, 100, or 1000): ");
        int num = sc.nextInt();

        if (num == 1) {
            printRange(1, 1);
        } else if (num == 10) {
            printRange(1, 10);
        } else if (num == 100) {
            printRange(1, 100);
        } else if (num == 1000) {
            printRange(1, 1000);
        } else {
            System.out.println("Invalid input.");
        }
    }

    private static void printRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}