package While_loop_statement.pro_02;

import java.util.Scanner;

public class Sum_of_natural_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println( sum );
    }
}
