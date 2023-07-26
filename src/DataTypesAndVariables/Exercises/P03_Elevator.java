package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //the Reason why we take the iput with double is so the Matg.ceil to work
        // Math.ceil works only with double
        double people = Integer.parseInt(scanner.nextLine());
        double capacity = Integer.parseInt(scanner.nextLine());

        //we cast the courses to int and round the number
        int courses = (int)Math.ceil(people/capacity);
        System.out.println(courses);

    }
}
