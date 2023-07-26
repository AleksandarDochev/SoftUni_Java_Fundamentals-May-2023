package Java04_Methods.Lab;

import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int area = cauculateRectangleArea(width,lenght);
        System.out.println(area);

    }
    public static int cauculateRectangleArea(int widthMethodCalc ,int lenghtMethodCalc){
        return widthMethodCalc*lenghtMethodCalc;
    }
}
