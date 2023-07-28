package Java10_TextProcessing.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        String reversedChars="";
        while (!input.equals("end")){

            for (int i = input.length()-1; i >= 0 ; i--) {
                char symbolCurrent =input.charAt(i);
                reversedChars+=symbolCurrent;
            }
            System.out.println(input+" = "+reversedChars);
            reversedChars="";
            input=scanner.nextLine();
        }


    }
}
