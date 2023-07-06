package BasicSyntax.code.Exerices;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = "";
        double totalCoins = 0;

        while (!input.equals("Start")){
            input = scanner.nextLine();
            if (input.equals("Start")){
                break;
            }
            double credit = Double.parseDouble(input);
            if (credit == 0.1){
                totalCoins = totalCoins+0.1;
            } else if (credit == 0.2 ) {
                totalCoins = totalCoins+0.2;
            } else if (credit == 0.5) {
                totalCoins = totalCoins+0.5;
            } else if (credit == 1) {
                totalCoins = totalCoins+1;
            }else if (credit == 2) {
                totalCoins = totalCoins+2;
            }else {
                System.out.printf("Cannot accept %.2f\n",credit);
            }
        }
        while (!input.equals("End")){
            input = scanner.nextLine();
            if (input.equals("End")){
                break;
            }
            String purchase = input;
            if (purchase.equals("Nuts")){
                if (totalCoins >=2.0){
                    totalCoins = totalCoins - 2.0;
                    System.out.println("Purchased Nuts");
                } else {
                    System.out.println("Sorry, not enough money");
                }

            } else if (purchase.equals("Water")) {
                if (totalCoins >=0.7){
                    totalCoins = totalCoins - 0.7;
                    System.out.println("Purchased Water");
                } else {
                    System.out.println("Sorry, not enough money");
                }

            }else if (purchase.equals("Crisps")) {
                if (totalCoins >=1.5){
                    totalCoins = totalCoins - 1.5;
                    System.out.println("Purchased Crisps");
                } else {
                    System.out.println("Sorry, not enough money");
                }

            }else if (purchase.equals("Soda")) {
                if (totalCoins >=0.8){
                    totalCoins = totalCoins - 0.8;
                    System.out.println("Purchased Soda");
                } else {
                    System.out.println("Sorry, not enough money");
                }

            }else if (purchase.equals("Coke")) {
                if (totalCoins >=1.0){
                    totalCoins = totalCoins - 1.0;
                    System.out.println("Purchased Coke");
                } else {
                    System.out.println("Sorry, not enough money");
                }

            }else {
                System.out.println("Invalid product");
            }

        }
        System.out.printf("Change: %.2f",totalCoins);

    }
}
