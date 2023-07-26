package Java05_List.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> productsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String inputData = scanner.nextLine();
            productsList.add(inputData);

        }
        int lineNumber=1;
        Collections.sort(productsList);
        for (String product:productsList) {
            System.out.printf("%d.%s%n",lineNumber++,product);
        }
    }
}
