package Java06_MidExamPreparation.June12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String items = scanner.nextLine();
        List<String> itemsList = Arrays.stream(items.split("!")).collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" ");



        while (!command[0].equals("Go")) {
            String product = command[1];

            if (command[0].equals("Urgent")) {

                if (!itemsList.contains(product)) {
                    itemsList.add(0, product);
                }
            } else if (command[0].equals("Unnecessary")) {
                if (itemsList.contains(product)) {
                    itemsList.remove(product);
                }
            } else if (command[0].equals("Correct")) {
                if (itemsList.contains(product)) {
                    String productNew = command[2];
                    int indexOfOldProduct = itemsList.indexOf(product);
                    itemsList.set(indexOfOldProduct, productNew);
                }
            } else if (command[0].equals("Rearrange")) {
                if (itemsList.contains(product)) {
                    itemsList.remove(product);
                    itemsList.add(itemsList.size() - 1, product);
                }
            }
                command = scanner.nextLine().split(" ");
        }
        System.out.println(String.join(", ",itemsList));
    }
}
