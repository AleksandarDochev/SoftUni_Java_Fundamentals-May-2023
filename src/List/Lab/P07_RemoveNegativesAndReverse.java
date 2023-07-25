package List.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P07_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String numberInput = scanner.nextLine();
        List<Integer> numbersListInteger1 = Arrays
                .stream(numberInput.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbersListInteger1.removeIf(e -> e <0);
        Collections.reverse(numbersListInteger1);
        if (numbersListInteger1.isEmpty()){
            System.out.println("empty");
        }
        for (int item: numbersListInteger1) {
            System.out.print(item+" ");
        }
    }
}
