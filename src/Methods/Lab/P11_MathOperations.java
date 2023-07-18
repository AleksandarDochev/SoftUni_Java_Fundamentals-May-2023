package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputNum1 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double inputNum2 = Double.parseDouble(scanner.nextLine());
        DecimalFormat df343= new DecimalFormat("0.#####");//12.0000 ->12 12.3454 ->12.346
        System.out.println(df343.format(calculatorMethod(inputNum1,operator,inputNum2)));
    }
    public static double calculatorMethod(double num1, String mathOperation, double num2){
        double result=0;
        if (mathOperation.equals("-")){
            result= num1-num2;
        }if (mathOperation.equals("+")){
            result= num1+num2;
        }if (mathOperation.equals("/")){
            result= num1/num2;
        }if (mathOperation.equals("*")){
            result = num1*num2;
        }
        return result;
    }
}
