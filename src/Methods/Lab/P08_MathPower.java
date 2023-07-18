package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numInput = Double.parseDouble(scanner.nextLine());
        int numPowerInput = Integer.parseInt(scanner.nextLine());
        DecimalFormat df343= new DecimalFormat("0.###");//12.0000 ->12 12.3454 ->12.346
        System.out.println(df343.format(numPowerCalc(numInput,numPowerInput)));
    }

    public static double numPowerCalc(double num,int power){
        return Math.pow(num,power);
    }
}
