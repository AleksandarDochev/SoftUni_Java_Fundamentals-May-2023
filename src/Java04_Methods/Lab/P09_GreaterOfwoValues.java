package Java04_Methods.Lab;

import java.util.Scanner;

public class P09_GreaterOfwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valueType = scanner.nextLine();

        if (valueType.equals("int")){
            int input1 = Integer.parseInt(scanner.nextLine());
            int input2 = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(input1,input2));
        } else if (valueType.equals("char")) {
            char input1 = scanner.nextLine().charAt(0);
            char input2 = scanner.nextLine().charAt(0);
            System.out.println(getMax(input1,input2));
        } else if (valueType.equals("string")) {
            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();
            System.out.println(getMax(input1,input2));
        }

    }
    public static int getMax(int intFirstNum,int intSecondNum){
        if (intFirstNum>intSecondNum){
            return intFirstNum;
        }else{
            return intSecondNum;
        }
    }
    public static char getMax(char charFirst,char charSecond){
        if (charFirst>charSecond){
            return charFirst;
        }else {
            return charSecond;
        }
    }
    public static String getMax(String stringFirst,String stringSecond){
        if (stringFirst.compareTo(stringSecond)>0){
            return stringFirst;
        }else {
            return stringSecond;
        }
    }

}
