package Java03_Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P05_TopIntegers_ConversionToWholeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbersArr = Arrays.stream(scanner.nextLine()          //"1 4 3 2"
                            .split(" "))                     //["1","4","3","2"]
                            .mapToInt(Integer::parseInt)           //[1,4,3,2] 
                            .toArray();

        //!!! last elementsis always top number - otpe4atwame
        for (int index = 0; index < numbersArr.length-1; index++) {
            //we take all numbers without the last one and we check if they are top numbers
            int currentNumber = numbersArr[index];
            boolean isBigger = true;
            //true the number is bigger than everyone on the right
            //false number isn't bigger
            for (int i = index+1; i < numbersArr.length; i++) {
                //all elements after mine with the last one included
                int numberAfter = numbersArr[i];
                if (currentNumber <= numberAfter){
                    isBigger=false;
                    break;
                    //my number is smaller the smo after it
                }
            }
            if(isBigger){
                //my number has always been bigger from the number after it
                System.out.print(currentNumber+" ");
            }
        }
        //we always print out the last numnber , because its always the top number without checking it
        System.out.print(numbersArr[numbersArr.length-1]);
    }
}
