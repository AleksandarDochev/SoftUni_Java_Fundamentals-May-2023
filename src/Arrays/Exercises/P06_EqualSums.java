package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine()          //"1 4 3 2"
                        .split(" "))                     //["1","4","3","2"]
                .mapToInt(Integer::parseInt)           //[1,4,3,2]
                .toArray();

        for (int index = 0; index < numbersArr.length - 1; index++) {
            int currentNumber = numbersArr[index];
            int leftSum = 0;
            int rightSum = 0;
            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum = leftIndex + numbersArr[leftIndex];
            }
            for (int rightIndex = index + 1; rightIndex < numbersArr.length - 1; rightIndex++) {
                rightSum += numbersArr[rightIndex];
            }

            if (leftSum == rightSum) {
                System.out.println(numbersArr[index]);
                //return;
            }
        }
        System.out.println("no");

    }
}
