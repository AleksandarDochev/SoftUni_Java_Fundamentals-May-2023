package Java04_Methods.Lab;

import java.util.Scanner;

public class P07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valueInput =scanner.nextLine();
        int iterationInput = Integer.parseInt(scanner.nextLine());
        stringPrint(valueInput,iterationInput);
    }
    private static void stringPrint(String valueMethod,int numIterationsMethod){
        for (int i = 0; i < numIterationsMethod; i++) {
            System.out.print(valueMethod);
        }

    }
}
