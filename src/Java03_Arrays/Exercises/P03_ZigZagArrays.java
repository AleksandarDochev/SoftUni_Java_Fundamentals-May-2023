package Java03_Arrays.Exercises;

import java.util.Scanner;

public class P03_ZigZagArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int iterations = Integer.parseInt(scanner.nextLine());
        String[] redNumArr = new String[iterations];
        int[] redNum= new int[iterations];
        int[] normNum= new int[iterations];

        for (int i = 0; i < iterations; i++) {
            String[] inputLineArr= scanner.nextLine().split(" ");
            if (i % 2 == 0){
                redNumArr[i] = inputLineArr[0];
                normNum[i] = Integer.parseInt(inputLineArr[1]);
            }else {
                redNumArr[i] = inputLineArr[1];
                normNum[i] = Integer.parseInt(inputLineArr[0]);
            }
        }
        for (int i = 0; i < redNum.length; i++) {
            System.out.print(redNumArr[i]+" ");
        }

        System.out.println();
        for (int i = 0; i < normNum.length; i++) {
            System.out.print(normNum[i]+" ");
        }


    }
}
