package BasicSyntax.code.Lab;

import java.util.Scanner;

public class P11MultiplicationTable2point0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        for (int i = y;i > 10;i++){

            int product = n*i;
            System.out.printf("%d X %d = %d\n",n,i,product);
            break;
        }
        for (int i = y;i <= 10;i++){

            int product = n*i;
            System.out.printf("%d X %d = %d\n",n,i,product);
        }

    }
}
