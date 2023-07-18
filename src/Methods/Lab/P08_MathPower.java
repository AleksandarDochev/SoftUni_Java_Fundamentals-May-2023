package Methods.Lab;

import java.util.Scanner;

public class P08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numInput = Double.parseDouble(scanner.nextLine());
        int numPowerInput = Integer.parseInt(scanner.nextLine());
        numPowerCalc(numInput,numPowerInput);
    }

    public static void numPowerCalc(double num,int power){
        System.out.println((int)Math.pow(num,power));
    }
}
