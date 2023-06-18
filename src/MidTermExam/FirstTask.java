package MidTermExam;

import java.util.Arrays;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float budget = Integer.parseInt(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0;


        double [] Student = Arrays.stream(scanner.nextLine()        //This is a massive that READS DATA from console and takes line given "24 50 36 70" and reads the elements
                          .split(""))                          // We parse the data from xxxx with one space intervals and put in a massive with these individual elements  ["24", "50", "36", "70"]
                          .mapToDouble(Double::parseDouble)
                          .toArray();

        double [] StudentStatic = new double[3]; // creating student massive
        Student [0] = flourPrice;
        Student [1] = eggPrice * 10;
        Student [2] = apronPrice;




        if (countStudents / 5 == 0)
        //double neededItemsForStudentsPrice = apronPrice * (Student[2] = apronPrice*0.2) ;

        while (countStudents > 0){
            countStudents = countStudents-1;
            //apronEndPrice =
            totalPrice = countStudents * (totalPrice + flourPrice + eggPrice + (apronPrice+ apronPrice*0.2));

        }
        if (budget > totalPrice){
            System.out.printf("Items purchased for %.2f$.",totalPrice);
        }else {
            System.out.printf("%.2f$ more needed.",totalPrice-budget);
        }


    }
}
