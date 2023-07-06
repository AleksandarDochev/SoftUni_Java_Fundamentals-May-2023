package DataTypesAndVariablesLab.code.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03_ExactSumofRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumIterationLength = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < inputNumIterationLength; i++) {
            BigDecimal inputNumberInIteration = new BigDecimal(scanner.nextLine());
            sum = sum.add(inputNumberInIteration);
        }
        System.out.println(sum);

    }

}
