package DataTypesAndVariablesLab.code.Lab.IIDataTypesAndTypeConversion;

import java.util.Scanner;

public class P08_LowerorUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.nextLine().charAt(0);


        ////-----------Solution 1 -----------
        if (symbol >='A' && symbol <= 'Z'){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
        ////-----------Solution 1 -----------

        ////-----------Solution 2 -----------
        if (Character.isUpperCase(symbol)){
            System.out.println("upper-case");
        } else if (Character.isLowerCase(symbol)) {
            System.out.println("lower-case");
        }
        ////-----------Solution 2 -----------



    }
}
