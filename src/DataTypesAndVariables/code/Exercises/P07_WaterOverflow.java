package DataTypesAndVariables.code.Exercises;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int waterStored=0;
        int capacity=255;
        // 5
        //        20
        //        100
        //        100
        //        100
        //        20

        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (waterStored < capacity &&waterStored+liters < capacity){
                waterStored += liters;
            }else {
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(waterStored);


    }
}
