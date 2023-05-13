package For_loop_statement.pro_03;

import java.util.Scanner;

public class Sum_of_n_natural_number_byforloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Natural number: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
