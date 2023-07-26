package Java02_DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numKeg = Integer.parseInt(scanner.nextLine());
        int biggestKeg = 0;
        String kegModel = "";

        for (int i = 1; i <= numKeg; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double formulaSize = Math.PI * radius * radius * height;
            if (formulaSize > biggestKeg){
                biggestKeg = 0;
                biggestKeg +=formulaSize;
                kegModel = model;
            }
        }
        System.out.println(kegModel);




    }
}
