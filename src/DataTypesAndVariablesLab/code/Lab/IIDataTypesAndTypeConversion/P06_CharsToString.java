package DataTypesAndVariablesLab.code.Lab.IIDataTypesAndTypeConversion;

import java.util.Scanner;

public class P06_CharsToString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputFirst = scanner.nextLine();
        String inputSecond = scanner.nextLine();
        String inputDelimeter = scanner.nextLine();

        System.out.printf("%s%s%s",inputFirst,inputDelimeter,inputSecond);
    }
}
