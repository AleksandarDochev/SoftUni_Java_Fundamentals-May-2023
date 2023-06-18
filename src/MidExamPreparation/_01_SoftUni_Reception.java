package MidExamPreparation;

import java.util.Scanner;

public class _01_SoftUni_Reception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //that scans 3 lines of input data
        int firstEmployeeStudents = Integer.parseInt(scanner.nextLine()); //numb of students that first employee services per hour
        int secondEmployeeStudents = Integer.parseInt(scanner.nextLine()); //numb of students that second employee services per hour
        int thirdEmployeeStudents = Integer.parseInt(scanner.nextLine()); //numb of students that third employee services per hour
        int studentsCount = Integer.parseInt(scanner.nextLine());  //num of all students serviced

        int totalHours = 0;//Num of hours needed for servicing all students

        //repetionin

        while (studentsCount>0){
            int studentsPerHour = firstEmployeeStudents+secondEmployeeStudents+thirdEmployeeStudents;
            totalHours++;
            if (totalHours % 4 ==0){
                continue; //if this "continue' is triggered the while cycle is restarted without executing the other code left in the cycle
            }
            studentsCount = studentsCount-studentsPerHour;
        }


        System.out.printf("Time needed: %dh.",totalHours);

    }
}
