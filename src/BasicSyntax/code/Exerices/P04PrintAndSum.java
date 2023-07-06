package BasicSyntax.code.Exerices;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numStart = Integer.parseInt(scanner.nextLine());
        int numEnd = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = numStart;i <= numEnd; i++){
            System.out.printf("%d ",i);
            sum = sum + i;
        }
        System.out.printf("\nSum: %d",sum);


    }
}
