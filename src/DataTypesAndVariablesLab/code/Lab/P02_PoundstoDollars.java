package DataTypesAndVariablesLab.code.Lab;

import java.util.Scanner;

public class P02_PoundstoDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputPounds = Double.parseDouble(scanner.nextLine());
        double covertedUSD = inputPounds * 1.36;
        System.out.printf("%.3f", covertedUSD);
    }
}
