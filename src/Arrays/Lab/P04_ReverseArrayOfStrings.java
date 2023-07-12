package Arrays.Lab;

import java.util.Scanner;

public class P04_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        //or String[] inputArr2 = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length/2; i++) {
            String oldElement = inputArr[i];
            //we put the -1 for the first iteration so we get the last symbol its 5-1-i(witch is 0) = 4
            //and for all the following we get - 1 to get the numbers one way back and i to move accordingly
            inputArr[i] = inputArr[inputArr.length-1 - i];
            inputArr[inputArr.length-1 - i] = oldElement;

        }

        System.out.println(String.join(" ",inputArr)); // how to pint ut string contents


    }
}
