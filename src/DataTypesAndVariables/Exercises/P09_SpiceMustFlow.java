package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int extract = Integer.parseInt(scanner.nextLine());

        int spiceMineDailyYeald = extract;
        int Days = 0;
        int minedSpice=0;
        int spiceMineReservers = 0;


        while (spiceMineDailyYeald >= 100){
            Days++;
            minedSpice = minedSpice + spiceMineDailyYeald; //Daily extract
            spiceMineDailyYeald -=10; // decay of mine
            minedSpice-=26; //worker pay


        }
        minedSpice = minedSpice-26;
        System.out.println(Days);
        System.out.println(minedSpice);

    }
}
