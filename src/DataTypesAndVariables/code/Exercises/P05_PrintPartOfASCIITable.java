package DataTypesAndVariables.code.Exercises;

import java.util.Scanner;

public class P05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startCode= Integer.parseInt(scanner.nextLine());
        int endCode = Integer.parseInt(scanner.nextLine());


        for (int code = startCode; code <= endCode; code++) {

            System.out.println((char)code+" ");
        }

    }
}
