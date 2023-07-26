package Java03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05_EvenAndOddSubtraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //create  int array   . get the input and split it with " ". and map it to the array length as integers
        int[] numbersArr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        int evenSum=0;
        int oddSum=0;
        for (int i = 0; i < numbersArr.length; i++) {
            int currentSum = numbersArr[i];
            if (currentSum % 2 == 0){
                evenSum += currentSum;
            }else {
                oddSum +=currentSum;
            }
            
        }
        System.out.println(evenSum-oddSum);

    }
}
