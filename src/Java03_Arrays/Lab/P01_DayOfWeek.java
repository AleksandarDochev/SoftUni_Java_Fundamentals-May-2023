package Java03_Arrays.Lab;

import java.util.Scanner;

public class P01_DayOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int nNum = n-1;

        String[] inputArr = {
                "Monday",//0
                "Tuesday",//1
                "Wednesday",//2
                "Thursday",//3
                "Friday",//4
                "Saturday",//5
                "Sunday"//6
        };
            if (nNum >= 0 && nNum <=6){
                System.out.println(inputArr[nNum]);
            }else {
                System.out.println("Invalid day!");
            }

        
    }

}
