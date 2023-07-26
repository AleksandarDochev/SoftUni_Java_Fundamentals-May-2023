package Java04_Methods.Exercises;

import java.util.Scanner;

public class P01_SmallestOfThreeNumbers {
    // https://judge.softuni.org/Contests/Compete/Index/1286#0
   // https://softuni.bg/trainings/resources/video/84558/video-03-june-2023-%D0%B4%D0%B5%D1%81%D0%B8%D1%81%D0%BB%D0%B0%D0%B2%D0%B0-%D1%82%D0%BE%D0%BF%D1%83%D0%B7%D0%B0%D0%BA%D0%BE%D0%B2%D0%B0-programming-fundamentals-with-java-may-2023/4095

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        System.out.println(numBottomCalc(n1,n2,n3));

    }
    public static int numBottomCalc(int num1, int num2, int num3){
        int smallestNum = 0;
        if (num1 < num2 && num1<num3 ){
            smallestNum = num1;
        } else if (num2 < num1 && num2<num3 ) {
            smallestNum = num2;
        } else if (num3 < num1 && num3<num2 ) {
            smallestNum =num3;
        }
        return smallestNum;
    }
}

