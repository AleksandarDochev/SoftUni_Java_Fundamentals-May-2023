package DataTypesAndVariablesLab.code.Lab.IIDataTypesAndTypeConversion;

import java.util.Scanner;

public class P04_TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputCity = scanner.nextLine();
        int inputPop = Integer.parseInt(scanner.nextLine());
        int inputSqkm = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",inputCity,inputPop,inputSqkm);


    }
}
