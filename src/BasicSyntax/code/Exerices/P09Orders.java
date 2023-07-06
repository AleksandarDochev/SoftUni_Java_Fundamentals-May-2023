package BasicSyntax.code.Exerices;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        double totalExpences = 0;
        for (int i = 0 ;i < N ;i++){
            double priceCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            double coffeExpense = ((days * capsuleCount) * priceCapsule);
            System.out.printf("\nThe price for the coffee is: $%.2f",coffeExpense);

            totalExpences = totalExpences + coffeExpense;
        }
        System.out.printf("\nTotal: $%.2f",totalExpences);

    }
}
