package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P09_ArrayModifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr = Arrays.stream(scanner.nextLine()          //"1 4 3 2"
                                 .split(" "))                     //["1","4","3","2"]
                                 .mapToInt(Integer::parseInt)           //[1,4,3,2]
                                 .toArray();
        String command =scanner.nextLine();
        while (!command.equals("end")){
            if (command.contains("swap")){
                int indexLocatedOn1 = Integer.parseInt(command.split(" ")[1]);
                int indexLocatedOn2 = Integer.parseInt(command.split(" ")[2]);
                int firstIndexNumber = numbersArr[indexLocatedOn1];
                int secondIndexNumber = numbersArr[indexLocatedOn2];

                numbersArr[indexLocatedOn1] = secondIndexNumber;
                numbersArr[indexLocatedOn2] = firstIndexNumber;

            } else if (command.contains("multiply")) {
                int indexLocatedOn1 = Integer.parseInt(command.split(" ")[1]);
                int indexLocatedOn2 = Integer.parseInt(command.split(" ")[2]);
                int firstIndexNumber = numbersArr[indexLocatedOn1];
                int secondIndexNumber = numbersArr[indexLocatedOn2];
                int product = firstIndexNumber * secondIndexNumber;
                numbersArr[indexLocatedOn1]=product;

            } else if (command.equals("decrease")) {
                for (int index = 0; index < numbersArr.length; index++) {
                    numbersArr[index] = numbersArr[index]-1;
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(numbersArr).replace("[","").replace("]",""));//Take ing arrays and print it out clean

    }
}
