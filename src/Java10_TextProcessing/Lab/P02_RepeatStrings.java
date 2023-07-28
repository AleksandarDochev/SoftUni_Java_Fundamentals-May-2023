package Java10_TextProcessing.Lab;

import java.util.Scanner;

public class P02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input =scanner.nextLine().split(" ");
        for (String item :input) {
            int timesToPrint = item.length();
            for (int i = 0; i < timesToPrint; i++) {
                System.out.printf("%s",item);
            }
        }

    }
}
