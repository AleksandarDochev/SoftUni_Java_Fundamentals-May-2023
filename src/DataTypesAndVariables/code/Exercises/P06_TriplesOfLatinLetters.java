package DataTypesAndVariables.code.Exercises;

import java.util.Scanner;

public class P06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //Explanation : https://softuni.bg/trainings/resources/video/83996/video-19-may-2023-desislava-topuzakova-programming-fundamentals-with-java-may-2023/4095
        //Vid time start -1:02:08 end
        for (char letter1 = 'a'; letter1 < 'a' + n; letter1++) {
            for (char letter2 = 'a'; letter2 < 'a' + n; letter2++) {
                for (char letter3 = 'a'; letter3 < 'a' + n; letter3++) {
                    System.out.printf("%c%c%c%n",letter1,letter2,letter3);
                }

            }
            
        }

    }
}
