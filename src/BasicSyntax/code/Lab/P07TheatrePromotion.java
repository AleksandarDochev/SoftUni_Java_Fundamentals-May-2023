package BasicSyntax.code.Lab;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());


        if (age<=-1){
            if (day.equals("Weekday")){
                System.out.println("Error!");
            }else if (day.equals("Weekend")){
                System.out.println("Error!");
            }else if (day.equals("Holiday")){
                System.out.println("Error!");
            }
        }
        else if (0<=age && age <= 18){
            if (day.equals("Weekday")){
                System.out.println("12$");
            }else if (day.equals("Weekend")){
                System.out.println("15$");
            }else if (day.equals("Holiday")){
                System.out.println("5$");
            }
        }
        else if (18<age && age<=64){
            if (day.equals("Weekday")){
                System.out.println("18$");
            }else if (day.equals("Weekend")){
                System.out.println("20$");
            }else if (day.equals("Holiday")){
                System.out.println("12$");
            }
        }
        else if (64<age && age<=122){
            if (day.equals("Weekday")){
                System.out.println("12$");
            }else if (day.equals("Weekend")){
                System.out.println("15$");
            }else if (day.equals("Holiday")){
                System.out.println("10$");
            }
        }

    }
}
