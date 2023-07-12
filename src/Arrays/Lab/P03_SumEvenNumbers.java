package Arrays.Lab;

import java.util.Scanner;

public class P03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        //we create a String array and it scans the whole line it automatically gets it length
        //by the amount of data give and differentiates  with a " " in between symbols
        String[] inputArrString = input.split(" ");

        //we create an int array with the length of the String array
        int[] numbersArr = new int[inputArrString.length];

        for (int i = 0; i < numbersArr.length; i++) {
            //we say for each position of the int array starting to zero ending at the length
            //we parse and put the data from the same position from the String array
            numbersArr[i] = Integer.parseInt(inputArrString[i]);
        }
        int sumEvenNum =0;
        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr[i] ;
            if ( currentNum % 2 == 0 ){
                sumEvenNum +=currentNum;
            }
        }
        System.out.println(sumEvenNum);



    }
}
