package BasicSyntax.code.Exerices;

import java.util.Scanner;

public class P08TriangleOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        for (int row = 1 ;row <= N ;row++){
            for (int col = 1;col <= row;col++){
                System.out.println(row);
                //System.out.printf("%d \n",row);
            }
        }

    }
}
