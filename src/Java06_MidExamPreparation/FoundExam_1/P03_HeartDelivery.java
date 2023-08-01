package Java06_MidExamPreparation.FoundExam_1;

import java.util.Arrays;
import java.util.Scanner;

public class P03_HeartDelivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] houses = Arrays.stream(scanner.nextLine()        //This is a massive that READS DATA from console and takes line given "24 50 36 70" and reads the elements
                        .split("@"))                          // We parse the data from xxxx with one space intervals and put in a massive with these individual elements  ["24", "50", "36", "70"]
                .mapToInt(Integer::parseInt)                //With this we take all the elemnts in ["24", "50", "36", "70"] and we convert them into normal integers [24, 50, 36, 70]
                //"mapToInt" reads every element of the massive and aplyes what;s in the "()" after it
                //"::"From the Class "Integer" we call the method "parseInt" and apply it to the read elements from "mapToInt"
                .toArray();                                    //With this we create the massive with Whole numbers "цели числа"

        int currentIndex = 0; //witch house is copidon located

        String command =scanner.nextLine();

        while (!command.equals("Love!")){
            //
            int jumpLength = Integer.parseInt(command.split(" ")[1]);
            //jumps
            currentIndex = currentIndex+jumpLength;
            //the house he jumps

            if (currentIndex > houses.length -1){
                currentIndex=0;
            }

            if (houses[currentIndex] != 0){
                houses[currentIndex] -= 2;
                if (houses[currentIndex] == 0){
                    System.out.printf("Place %d has Valentine's day.",currentIndex);
                }

            }else {

                System.out.printf("Place %d already had Valentine's day.",currentIndex);

            }


            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n",currentIndex);
        boolean isFailed = false;
        int countFailedHouse = 0;
        for (int house : houses) {
            if (house != 0){
                isFailed = true;
                countFailedHouse++;
            }
        }
        if (isFailed){
            System.out.printf("Cupid has failed %d places.%n",countFailedHouse);
        }else {
            System.out.println("Mission was successful.");
        }

    }

}
