package Java03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine()  //we scan line 1
                .split(" "))              // we split the scanned line
                .mapToInt(e -> Integer.parseInt(e))  // we map elements e to parse them to e
                .toArray();                        // we return them to the Array

        int[] secondArr = Arrays.stream(scanner.nextLine() //we scan line 2 etc .
                .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum =0;

        // Can't understand https://softuni.bg/trainings/resources/video/84292/video-25-may-2023-veronika-vaneva-programming-fundamentals-with-java-may-2023/4095
        // Time - 26:01;
        int diffIndex = -1;
        for (int i = 0; i < firstArr.length; i++) {
            int firstNum = firstArr[i];
            int secondNum = secondArr[i];
            if (firstNum == secondNum){
                sum += firstNum;
            }else {
                diffIndex = i;
                break;
            }
        }
        if (diffIndex == -1){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.",diffIndex);
        }

        }
    }

