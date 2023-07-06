package BasicSyntax.code.Exerices;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        double totalPrice =0;

        if (type.equals("Students")){
            if (day.equals("Friday")){
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.80;
            } else if (day.equals("Sunday")) {
                price = 10.46;
            }
        }else if (type.equals("Business")){
            if (day.equals("Friday")){
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                price = 16;
            }
        }else if (type.equals("Regular")){
            if (day.equals("Friday")){
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.50;
            }
        }



        if (type.equals("Students")){
            if (num >= 30){
                totalPrice = num * price;
                totalPrice = totalPrice - (0.15*totalPrice);
                System.out.printf("Total price: %.2f",totalPrice);
            }else {
                totalPrice = num * price;
                System.out.printf("Total price: %.2f",totalPrice);
            }
        }
        if (type.equals("Business")){
            if (num >= 100){
                num = num -10;
                totalPrice = num * price;
                System.out.printf("Total price: %.2f",totalPrice);
            }else {
                totalPrice = num * price;
                System.out.printf("Total price: %.2f",totalPrice);
            }

        }

        if (type.equals("Regular")){
            if ( num >= 10 && num <= 20){
                totalPrice = num * price;
                totalPrice = totalPrice - (0.05*totalPrice);
                System.out.printf("Total price: %.2f",totalPrice);
            }else {
                totalPrice = num * price;
                System.out.printf("Total price: %.2f",totalPrice);
            }
        }
    }
}
