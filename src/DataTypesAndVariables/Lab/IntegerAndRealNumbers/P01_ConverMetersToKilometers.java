package DataTypesAndVariables.Lab.IntegerAndRealNumbers;

import java.util.Scanner;

public class P01_ConverMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputMeters = Integer.parseInt(scanner.nextLine());
        double km = inputMeters / 1000.0;
        System.out.printf("%.2f",km);
    }
}
