package Arrays.Exercises;

import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        3
//        13
//        24
//        8
        int iterations = Integer.parseInt(scanner.nextLine());
        int[] numbersArr= new int[iterations]; //massive n here is the amount of elements
        int sum =0;
        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr [i] = Integer.parseInt(scanner.nextLine());
            sum += numbersArr[i];

        }
        for (int i = 0; i < numbersArr.length; i++) {
            System.out.printf("%d ",numbersArr[i]);
        }


        System.out.printf("%n%d",sum);


    }
}
