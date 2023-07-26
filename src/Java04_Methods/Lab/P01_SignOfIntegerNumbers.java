package Java04_Methods.Lab;

import java.util.Scanner;

public class P01_SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        printNumberSign(num);

    }
    public static void printNumberSign(int num){
        if (num < 0){
            System.out.printf("The number %d is negative.\n",num);
        } else if (num>0) {
            System.out.printf("The number %d is positive.\n",num);
        } else if (num == 0) {
            System.out.printf("The number %d is zero.\n",num);
        }
    }





}
