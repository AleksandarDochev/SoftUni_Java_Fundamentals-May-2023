package List.Lab;

import java.text.DecimalFormat;
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

        int iterationsNumSize = numbersListInteger.size();
        for (int i = 0; i <= iterationsNumSize/2; i++) {
            int firstNUm =numbersListInteger.get(i);
            int lastNUm =numbersListInteger.get(numbersListInteger.size()-1);
            int sum=firstNUm+lastNUm;
            numbersListInteger.set(i , sum);
            numbersListInteger.remove(numbersListInteger.size()-1);
        }
        for (int item: numbersListInteger) {
            System.out.print(item+" ");
        }
    }

}
