package Java01_BasicSyntax.code.Lab;

import java.util.Scanner;

public class P12EvenNumberForCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n;i <= n;i++){

            if (n % 2 == 0){
                System.out.println("The number is: "+ Math.abs(n));
                break;

            } else if (n==1) {
                System.out.println("Please write an even number.");
            } else {
                System.out.println("Please write an even number.");
            }
            n = Integer.parseInt(scanner.nextLine());
        }
    }
}
