package Arrays.Exercises;

import java.util.Scanner;

public class P02_CommonElements_CompareElementsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstRowRawInput =scanner.nextLine();
        String secondRowRawInput = scanner.nextLine();

        String[] firstRowArr = firstRowRawInput.split(" ");
        String[] secondRowArr = secondRowRawInput.split(" ");
        String doubles = "";

        for (int i = 0; i < secondRowArr.length; i++) {
            String currentElementSecondRowArr = secondRowArr[i];
            for (int j = 0; j < firstRowArr.length; j++) {
                String currentElementFirstRowArr = firstRowArr[j];
                if (currentElementFirstRowArr.equals(currentElementSecondRowArr)){
                    doubles = currentElementFirstRowArr;
                    System.out.print(doubles+" ");
                }
            }
        }

    }
}
