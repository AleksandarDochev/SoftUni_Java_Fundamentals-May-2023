package Arrays.Exercises;

import java.util.Scanner;
import java.util.Arrays;

public class P07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxLength = Integer.MIN_VALUE;
        int length = 0;

        String symbol = "";
        for (int i = 0; i < numbers.length; i++) {
            int nextNumber = i == numbers.length - 1 ? 0 : numbers[i + 1];
            if (numbers[i] == nextNumber) {
                length++;
            } else {
                if (maxLength < length) {
                    maxLength = length;
                    symbol = String.valueOf(numbers[i]);

                }
                length = 0;
            }

        }
        if (maxLength < 0) {
            System.out.println(Arrays.toString(numbers).replaceAll("[\\[\\],]", ""));
        } else {
            for (int i = 0; i < maxLength + 1; i++) {
                System.out.print(symbol + " ");
            }
        }
    }
}
