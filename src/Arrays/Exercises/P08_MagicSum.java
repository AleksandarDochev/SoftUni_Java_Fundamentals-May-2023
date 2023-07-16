package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr = Arrays.stream(scanner.nextLine()          //"1 4 3 2"
                            .split(" "))                     //["1","4","3","2"]
                            .mapToInt(Integer::parseInt)           //[1,4,3,2]
                            .toArray();
        int targetSum = Integer.parseInt(scanner.nextLine());

        //we go thtough asll the numbers
        for (int index = 0; index < numbersArr.length-1; index++) {
            int currentNumber = numbersArr[index];
            for (int i = index+1; i <= numbersArr.length-1; i++) {
                int nextNumber = numbersArr[i];// number after currentNumber
                if (currentNumber+ nextNumber == targetSum){
                    System.out.println(currentNumber+" "+nextNumber);
                }
            }
        }

    }
}
