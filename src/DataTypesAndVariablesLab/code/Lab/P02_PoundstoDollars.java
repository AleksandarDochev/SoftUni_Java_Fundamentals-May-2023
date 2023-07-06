package DataTypesAndVariablesLab.code.Lab;

import java.util.Scanner;

public class P02_PoundstoDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputPounds = Double.parseDouble(scanner.nextLine());
        double covertedUSD = inputPounds * 1.36;
        System.out.printf("%.3f", covertedUSD);


        float inputPoundsFloat = Float.parseFloat(scanner.nextLine());
        float dollars = inputPoundsFloat * 1.36f; // search docsAndPics for explanation ,
                                                  // short explanation the number in blue is by default double so we convert it explixidly to double
                                                  // we are going to haVe the correct precision with multiplying float with float here
        System.out.printf("%.3f", dollars);
    }
}
