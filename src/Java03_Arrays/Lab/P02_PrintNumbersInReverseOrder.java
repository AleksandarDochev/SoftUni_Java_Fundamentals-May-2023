package Java03_Arrays.Lab;

import java.util.Scanner;

public class P02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] numbersArr= new int[n]; //massive n here is the amount of elements

        for (int i = 0; i < numbersArr.length ; i++) {
            numbersArr[i] = Integer.parseInt(scanner.nextLine());
            //numbersArr[we take the position of the element] and we tell what the number is going to go there
        }

        for (int i = numbersArr.length; i > 0; i--) {
            System.out.printf("%d ",numbersArr[i-1]);
        }

    }
}
