package MidTermExam;

import java.util.Scanner;

public class FirstTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float budget = Integer.parseInt(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = apronPrice * (countStudents + Math.ceil(countStudents*0.2)) + eggPrice * 10 * (countStudents)+
                                 flourPrice*(countStudents - countStudents/5);

        //double totalPrice = countStudents * pricePerStudent;


        if (budget > totalPrice){
            System.out.printf("Items purchased for %.2f$.",totalPrice);
        }else {
            System.out.printf("%.2f$ more needed.",totalPrice-budget);
        }


    }
}
