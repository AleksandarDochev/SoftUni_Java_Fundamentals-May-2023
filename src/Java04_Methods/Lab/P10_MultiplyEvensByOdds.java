package Java04_Methods.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInputConsole = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(evenSumMethod(numInputConsole)*oddSumMethod(numInputConsole));

    }
//    public static int multiplyMethod (int inputNumForMethod){
//        return evenSumMethod(inputNumForMethod)*oddSumMethod(inputNumForMethod);
//    }
    public static int evenSumMethod(int inputNumForMethodEven){
        String intToString = Integer.toString(inputNumForMethodEven);
        int [] numbersArr78686 = Arrays.stream(intToString.split(""))//["1","4","3","2"]
                                .mapToInt(Integer::parseInt)           //[1,4,3,2]
                                .toArray();
        int sum =0;
        for (int forEachNumOfTheArray : numbersArr78686) {
            if (forEachNumOfTheArray%2==0){
                sum +=forEachNumOfTheArray;
            }
        }
        return sum;
    }
    public static int oddSumMethod(int inputNumForMethodOdd){
        String intToString = Integer.toString(inputNumForMethodOdd);
        int [] numbersArr78686 = Arrays.stream(intToString.split(""))//["1","4","3","2"]
                .mapToInt(Integer::parseInt)           //[1,4,3,2]
                .toArray();
        int sum =0;
        for (int forEachNumOfTheArray : numbersArr78686) {
            if (forEachNumOfTheArray%2!=0){
                sum +=forEachNumOfTheArray;
            }
        }
        return sum;
    }
}
