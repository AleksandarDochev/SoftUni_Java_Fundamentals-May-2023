package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSymbols = Integer.parseInt(scanner.nextLine());
        int sumASCII = 0;

        for (int i = 0; i <numSymbols ; i++) {
            char inputSymbol = scanner.nextLine().charAt(0);
            sumASCII = sumASCII + ((int) inputSymbol);

        }
        System.out.printf("The sum equals: %d",sumASCII);



    }
}
