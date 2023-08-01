package Java06_MidExamPreparation.FoundExam_1;

import java.util.Scanner;

public class P01_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodKG = Double.parseDouble(scanner.nextLine());
        double hayKG = Double.parseDouble(scanner.nextLine());
        double coverKG = Double.parseDouble(scanner.nextLine());
        double wightKG = Double.parseDouble(scanner.nextLine());

        double foodGrams = foodKG*1000;
        double hayGrams =hayKG*1000;
        double coverGrams =coverKG*1000;
        double wightKGrams =wightKG*1000;

        for (int day = 1; day <= 30; day++) {
            foodGrams-=300;
            if (day%2==0 ){
                double fivePercentFromFood=foodGrams*0.05;
                hayGrams = hayGrams -fivePercentFromFood;
            }
            if (day%3==0){
                double oneThirdOfWeight = wightKGrams*0.3333333;
                coverGrams = coverGrams - oneThirdOfWeight;
            }
        }
        if (foodGrams<=0 ||hayGrams<=0||coverGrams<=0){
            System.out.println("Merry must go to the pet store!");
        }else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodGrams/1000,hayGrams/1000,coverGrams/1000);
        }

    }
}
