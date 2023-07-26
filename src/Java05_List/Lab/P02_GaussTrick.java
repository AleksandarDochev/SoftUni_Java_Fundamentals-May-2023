package Java05_List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Integer> numbersListInteger = Arrays
                .stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int size = numbersListInteger.size();
        for (int i = 0; i < size / 2; i++) {
            int firstNum = numbersListInteger.get(i);
            int secondNum = numbersListInteger.get(numbersListInteger.size() - 1);
            int sum = firstNum+secondNum;
            numbersListInteger.set(i, sum);
            numbersListInteger.remove(numbersListInteger.size() - 1);
        }
        for (int item: numbersListInteger) {
            System.out.print(item +" ");
        }
    }

}
