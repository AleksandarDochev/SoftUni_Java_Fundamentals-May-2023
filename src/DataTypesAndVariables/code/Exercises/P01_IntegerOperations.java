package DataTypesAndVariables.code.Exercises;

import java.util.Scanner;

public class P01_IntegerOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input1 = Integer.parseInt(scanner.nextLine());
        int input2 = Integer.parseInt(scanner.nextLine());
        int input3 = Integer.parseInt(scanner.nextLine());
        int input4 = Integer.parseInt(scanner.nextLine());

        int firstSumSecond = input1+input2;
        int divideSumByThird = firstSumSecond/input3;
        int resultMultiply = divideSumByThird*input4;
        System.out.println(resultMultiply);

    }
}
