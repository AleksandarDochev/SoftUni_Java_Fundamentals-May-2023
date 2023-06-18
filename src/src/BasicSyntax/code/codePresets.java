package src.BasicSyntax.code;

import java.util.Arrays;
import java.util.Scanner;

public class codePresets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /////////
        int [] arrayXX = Arrays.stream(scanner.nextLine()        //This is a massive that READS DATA from console and takes line given "24 50 36 70" and reads the elements
                     .split(" "))                          // We parse the data from xxxx with one space intervals and put in a massive with these individual elements  ["24", "50", "36", "70"]
                     .mapToInt(Integer::parseInt)                //With this we take all the elemnts in ["24", "50", "36", "70"] and we convert them into normal integers [24, 50, 36, 70]
                                                                 //"mapToInt" reads every element of the massive and aplyes what;s in the "()" after it
                                                                 //"::"From the Class "Integer" we call the method "parseInt" and apply it to the read elements from "mapToInt"
                     .toArray();                                 //With this we create the massive with Whole numbers "цели числа"
                                                                 //this takes the 'processed' code from the previous lines and puts it back  in massive with integer elements this time
        //////////
        //
        int [] arrayXXX = new int[10];  //This an empty massive that we will fill with data later and it will have 10 elements
        arrayXXX [0] = 10; //Here in the 'arrayXXX' on position '0' we put the data '10'
        //


        int xx = Integer.parseInt(scanner.nextLine());
        String xxx = scanner.nextLine();
        double x = Double.parseDouble(scanner.nextLine());

    }
}
