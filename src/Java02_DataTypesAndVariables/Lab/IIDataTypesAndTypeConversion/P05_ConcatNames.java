package Java02_DataTypesAndVariables.Lab.IIDataTypesAndTypeConversion;

import java.util.Scanner;

public class P05_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFirst = scanner.nextLine();
        String inputSecond = scanner.nextLine();
        String inputDelimeter = scanner.nextLine();

        String combine = "";

        System.out.printf("%s%s%s",inputFirst,inputDelimeter,inputSecond);

    }
}
