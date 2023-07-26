package Java05_List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input2 = scanner.nextLine();

        List<Integer> numbersListInteger0 = Arrays
                .stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numbersListInteger1 = Arrays
                .stream(input2.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();
        int minSize = Math.min(numbersListInteger0.size(),numbersListInteger1.size());
        for (int i = 0; i < minSize; i++) {
            int numFirstList = numbersListInteger0.get(i);
            int numSecondList =numbersListInteger1.get(i);
            resultList.add(numFirstList);
            resultList.add(numSecondList);
        }

        if (numbersListInteger0.size()>numbersListInteger1.size()){
            List<Integer> firstListRemainingDataSubList = numbersListInteger0.subList(minSize,numbersListInteger0.size());
            resultList.addAll(firstListRemainingDataSubList);
        } else if (numbersListInteger1.size()>numbersListInteger0.size()) {
            List<Integer> secondListRemainingDataSubList = numbersListInteger1.subList(minSize,numbersListInteger1.size());
            resultList.addAll(secondListRemainingDataSubList);
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]",""));
    }
}
