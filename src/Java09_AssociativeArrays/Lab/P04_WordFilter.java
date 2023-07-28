package Java09_AssociativeArrays.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P04_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArr = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> w.length()%2==0)
                .toArray(String[]::new);

        for (String element:wordsArr) {
            System.out.println(element);
        }

        //working version with lambda
//        String[] wordsArr =scanner.nextLine().split(" ");
//        ArrayList<String> resultList = new ArrayList<>();
//        for (String item:wordsArr) {
//            if (item.length()%2==0){
//                resultList.add(item);
//            }
//        }
//        for (String element:resultList) {
//            System.out.println(element);
//        }

    }
}
