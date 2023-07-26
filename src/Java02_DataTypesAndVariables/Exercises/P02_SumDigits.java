package Java02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P02_SumDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (inputNumber>0){

            int lastDigit = inputNumber % 10;       //how to get the last digit from a number
            sum = sum + lastDigit ;
            inputNumber = inputNumber / 10;        //How to remove the last digit from and int number
        }
        System.out.println(sum);
    }
}
