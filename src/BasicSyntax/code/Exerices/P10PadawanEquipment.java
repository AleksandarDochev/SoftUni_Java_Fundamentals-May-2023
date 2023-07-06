package BasicSyntax.code.Exerices;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());


        double studentCountRoundUP= Math.ceil(studentCount*0.1)+studentCount;

        double lightsaberExpense =studentCountRoundUP*priceLightsabers;
        int freeBelts = studentCount/6;
        double beltExpense = ((studentCount-freeBelts)*priceBelts);
        double robeExpense = studentCount*priceRobes;

        double totalExpense= lightsaberExpense+beltExpense+robeExpense;

        if (budget < totalExpense){
            System.out.printf("George Lucas will need %.2flv more.",totalExpense-budget);
        } else if (budget > totalExpense) {
            System.out.printf("The money is enough - it would cost %.2flv.",totalExpense);
        }
    }
}
