package Java04_Methods.Lab;

import java.util.Scanner;

public class P05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productNameInput =scanner.nextLine();
        int numProductsInput = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f",ordersCalcMethod(productNameInput,numProductsInput));



    }
    public static double ordersCalcMethod(String productNameCalc, int productNumCalc){
        double result =0;
        if (productNameCalc.equals("coffee")){
            result += 1.50*productNumCalc;
        } else if (productNameCalc.equals("water")) {
            result += 1.00*productNumCalc;
        } else if (productNameCalc.equals("coke")) {
            result += 1.40*productNumCalc;
        }else if (productNameCalc.equals("snacks")){
            result += 2.00*productNumCalc;
        }
        return result;
    }
}
