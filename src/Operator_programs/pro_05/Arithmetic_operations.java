package Operator_programs.pro_05;

import java.util.Scanner;

public class Arithmetic_operations {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = input.nextDouble();
        System.out.print("Enter the second number: ");
        double b = input.nextDouble();
        System.out.print("Enter the third number: ");
        double c = input.nextDouble();

        double result1 = a + b * c;
        double result2 = c + a / b;
        double result3 = a % b + c;
        double result4 = a * b + c;

        double[] results = {result1, result2, result3, result4};
        double maxResult = Double.MIN_VALUE;
        double minResult = Double.MAX_VALUE;

        for (int i = 0; i < results.length; i++) {
            if (results[i] > maxResult) {
                maxResult = results[i];
            }
            if (results[i] < minResult) {
                minResult = results[i];
            }
        }


        System.out.println("Maximum result: " + maxResult);
        System.out.println("Minimum result: " + minResult);
        }
}

