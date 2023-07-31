package Java06_MidExamPreparation.June12;

import java.util.Map;
import java.util.Scanner;

public class P01_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double attendances = 0;


        double bestStudentBonus =0;
        double bestStudentLectures =0;



        for (int i = 0; i < studentCount; i++) {
            attendances = Double.parseDouble(scanner.nextLine());//student attendence
            double check= attendances/lecturesCount ;
            double currentBonus = (attendances/lecturesCount)*(5+additionalBonus);
            if (currentBonus>bestStudentBonus ){
                bestStudentBonus=currentBonus;
                bestStudentLectures=attendances;
            }

        }
        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(bestStudentBonus));
        System.out.printf("The student has attended %.0f lectures.%n",bestStudentLectures);



    }
}

