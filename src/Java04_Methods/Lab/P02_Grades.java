package Java04_Methods.Lab;

import java.util.Scanner;

public class P02_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        printGrade(num);

    }

    public static void printGrade(double num){
//         2.00 – 2.99 - "Fail"
//•        3.00 – 3.49 - "Poor"
//•        3.50 – 4.49 - "Good"
//•        4.50 – 5.49 - "Very good"
//•        5.50 – 6.00 - "Excellent"
        if (num >= 2.00 && num<=2.99){
            System.out.println("Fail");
        } else if (num >=3.00  && num<=3.49) {
            System.out.println("Poor");
        }else if (num >=3.50  && num<=4.49) {
            System.out.println("Good");
        }else if (num >=4.50  && num<=5.49) {
            System.out.println("Very good");
        }else if (num >=5.50  && num<=6) {
            System.out.println("Excellent");
        }

    }
}
