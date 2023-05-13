package Operator_programs.pro_05;

public class SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        boolean isSpring = false;
        if (month == 3) {
            if (day >= 20) {
                isSpring = true;
                }
            } else if (month == 4 || month == 5) {
                isSpring = true;
            } else if (month == 6) {
                if (day <= 20) {
                    isSpring = true;
                }
            }

            System.out.println(isSpring);
        }
}

