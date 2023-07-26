package Java03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine()  //we scan line 1
                        .split(" "))              // we split the scanned line
                        .mapToInt(e -> Integer.parseInt(e))  // we map elements e to parse them to e
                        .toArray();

        int[] condensedArrAfterNumbersArr = new int[numbersArr.length -1];

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr.length == 1 ){
                //System.out.printf("%d is already condensed to number",numbersArr.length);
                break;
            }
            if (i == numbersArr.length-1){
                int[] condensedArrAfterCondesedAlready = new int[condensedArrAfterNumbersArr.length-1];
                //reason why we put it to -1 is so the cycle can repeat from --- for (int i = 0; i < numbersArr.length; i++)
                //and this way we re-use all the code form the begging even on line 15 --- int[] condensedArrAfterNumbersArr = new int[numbersArr.length -1];
                i=-1;

                numbersArr = condensedArrAfterNumbersArr;
                condensedArrAfterNumbersArr = condensedArrAfterCondesedAlready;
            }else {
                condensedArrAfterNumbersArr[i] = numbersArr[i]+numbersArr[i+1];
            }
        }
        System.out.println(numbersArr[0]);
    }
}
