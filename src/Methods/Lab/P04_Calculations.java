package Methods.Lab;
import java.util.Scanner;
public class P04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commandInput =scanner.nextLine();
        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());
        if (commandInput.equals("add")){
            System.out.println(add(firstNumInput,secondNumInput));

        } else if (commandInput.equals("subtract")) {
            System.out.println(subtract(firstNumInput,secondNumInput));

        } else if (commandInput.equals("multiply")) {
            System.out.println(multiply(firstNumInput,secondNumInput));

        } else if (commandInput.equals("divide")) {
            System.out.println(divide(firstNumInput,secondNumInput));
        }


    }

    public static Integer add(int firstNumCalc,int secondNumCalc){
        return firstNumCalc+secondNumCalc;
    }
    public static Integer multiply(int firstNumCalc,int secondNumCalc){
        return firstNumCalc*secondNumCalc;
    }
    public static Integer subtract(int firstNumCalc,int secondNumCalc){
        return firstNumCalc-secondNumCalc;
    }
    public static Integer divide(int firstNumCalc,int secondNumCalc){
        return firstNumCalc/secondNumCalc;
    }
}
