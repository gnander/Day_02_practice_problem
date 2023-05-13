package If_else_statement.pro_01;

import java.util.Scanner;

public class Number_in_word {

    public static void printNumber(int num){
        String word = "";
        switch (num) {
            case 0:
                word = "zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
            default:
                System.out.println("Invalid input.");
                System.exit(0);
        }

        System.out.println( word );

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single-digit number: ");
        int num = sc.nextInt();
        printNumber(num);

    }
}