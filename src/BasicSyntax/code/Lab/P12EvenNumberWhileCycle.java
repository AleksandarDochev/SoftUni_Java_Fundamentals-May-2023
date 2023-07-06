package BasicSyntax.code.Lab;

import java.util.Scanner;

public class P12EvenNumberWhileCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        while (n % 2 != 0) {
            System.out.println("Please write an even number.");
            n = Integer.parseInt(scanner.nextLine());

        }
        System.out.println("The number is: "+ Math.abs(n));

//        for (int i = n;i <= n;i++){
//
//            if (n % 2 == 0){
//                System.out.println("The number is: "+ Math.abs(n));
//                break;
//
//            } else if (n==1) {
//                System.out.println("Please write an even number.");
//            } else {
//                System.out.println("Please write an even number.");
//            }
//            n = Integer.parseInt(scanner.nextLine());
//        }
    }
}
