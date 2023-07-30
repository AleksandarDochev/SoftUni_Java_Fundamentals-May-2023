package Java13_FinalExam30July;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString =scanner.nextLine();
        //StringBuilder inputString = new StringBuilder();
        String input=scanner.nextLine();


        while (!input.equals("End")){
            String[] command = input.split(" ");
            if (command[0].equals("Translate")){
                String oldChar= command[1];
                String newChar= command[2];
                inputString=inputString.replace(oldChar,newChar);
                System.out.println(inputString);
            } else if (command[0].equals("Includes")){
                String substring= command[1];
                if (inputString.contains(substring)){
                    System.out.println("True");
                }else {
                    System.out.println("False");
                }
            } else if (command[0].equals("Start")) {
                String substring=command[1];
                String[] separetedInpputString=inputString.split(" ");
                if (separetedInpputString[0].equals(substring)){
                    System.out.println("True");
                }else {
                    System.out.println("False");
                }
            } else if (command[0].equals("Lowercase")) {
                inputString=inputString.toLowerCase();
                System.out.println(inputString);
            } else if (command[0].equals("FindIndex")) {
                String findIndexSubstring= command[1];
                int indexCount=0;
                int chatLastPosition=0;
                for (int i = 0; i < inputString.length(); i++) {
                    indexCount++;
                    if (inputString.contains(findIndexSubstring)){
                        chatLastPosition=0;
                        chatLastPosition=indexCount;
                    }

                }
                System.out.printf("%d",chatLastPosition);
            } else if (command[0].equals("Remove")){

                int startIndex= Integer.parseInt(command[1]);
                int count=Integer.parseInt(command[2]);
                List<Character> charsToRemove = new ArrayList<>();
                for (int i = startIndex; i < count; i++) {
                    char symbol = (char) inputString.indexOf(i);
                    charsToRemove.add(symbol);

//                    String toRemove = inputString.indexOf(i);
//                    char symbol = inputString.charAt(i);
//                    inputString.indexOf(i)
//
//                    String[] inputStringArr = inputString.split(" ");
//                    String symbolCurrent =inputStringArr[i];
//                    for (char symbol:inputString) {
//
//                    }
//                    inputString.replace(symbolCurrent,"");
//                    System.out.println(inputString);
                }
                for (Character item:charsToRemove) {
                    System.out.print(item);
                }
            }

            input=scanner.nextLine();
        }

    }
}
