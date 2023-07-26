package Java05_List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ListManipulationAdvanced {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        String inputData = scanner.nextLine();
        List<String> inputList = Arrays.stream(inputData.split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();;
        while (!input.equals("end")){
            String[] commandArrInput = input.split(" ");
            String command = commandArrInput[0];
            List<Integer> numLesserSout = new ArrayList<>();

            //int number = Integer.parseInt(commandArrInput[1]);
            if (command.equals("Contains")){
                boolean numCheck = inputList.contains(commandArrInput[1]);
                if (numCheck==true){
                    System.out.println("Yes");
                }else {
                    System.out.println("No such number");
                }
                }
            if (command.equals("Print")){
                if (commandArrInput[1].equals("even")){
                    for (String numberString:inputList) {
                        int numberInt = Integer.parseInt(numberString);
                        if (numberInt%2 == 0){
                            List<Integer> numListEven = new ArrayList<>();
                            numListEven.add(numberInt);
                            for (int item: numListEven) {
                                System.out.print(item+" ");
                            }
                        }
                    }
                    System.out.println();
                }else if (commandArrInput[1].equals("odd")) {
                    for (String numberString:inputList) {
                        int numberInt = Integer.parseInt(numberString);
                        if (numberInt%2 == 1){
                            List<Integer> numListOdd = new ArrayList<>();
                            numListOdd.add(numberInt);
                            for (int item: numListOdd) {
                                System.out.print(item+" ");
                            }
                        }
                    }

                }
            }
            if (input.equals("Get sum")){
                int sum=0;
                for (String numberString:inputList) {
                    int numberInt = Integer.parseInt(numberString);
                    sum+=numberInt;
                }
                System.out.println();
                System.out.println(sum);
            }
            if (command.equals("Filter")){
                if (commandArrInput[1].equals(">=")){
                    int numBiggerOrEqual = Integer.parseInt(commandArrInput[2]);
                    for (String numberString:inputList) {
                        int numberInt = Integer.parseInt(numberString);
                        if (numberInt>=numBiggerOrEqual){
                            System.out.print(numberInt+" ");
                        }
                    }
                } else if (commandArrInput[1].equals("<")) {
                    System.out.println();
                    int numBiggerOrEqual = Integer.parseInt(commandArrInput[2]);
                    for (String numberString : inputList) {
                        int numberInt = Integer.parseInt(numberString);
                        if (numberInt < numBiggerOrEqual) {
                            System.out.print(numberInt+" ");
                        }
                    }
                }

            }

            input = scanner.nextLine();
            }

        }

        //https://softuni.bg/trainings/resources/video/84732/video-07-june-2023-veronika-vaneva-programming-fundamentals-with-java-may-2023/4095
        //Time : -27:18

    }
