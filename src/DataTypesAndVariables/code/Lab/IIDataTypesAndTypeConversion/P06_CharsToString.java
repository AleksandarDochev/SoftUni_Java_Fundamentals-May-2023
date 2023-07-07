package DataTypesAndVariables.code.Lab.IIDataTypesAndTypeConversion;

import java.util.Scanner;

public class P06_CharsToString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        if (input1.equals("")){
            input1 = "o";
        }
        String input2 = scanner.nextLine();
        if (input2.equals("")){
            input2 = "o";
        }
        String input3 = scanner.nextLine();
        if (input3.equals("")){
            input3 = "o";
        }


        System.out.printf("%s%s%s",input1,input2,input3);
    }
}
