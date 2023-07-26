package Java05_List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListManipulationBasics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> numbersListInteger = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] commandArrInput = input.split(" ");
            String command = commandArrInput[0];
            int number = Integer.parseInt(commandArrInput[1]);
            int index=0;
            if (commandArrInput.length>2){
                index += Integer.parseInt(commandArrInput[2]);
            }

            switch (command){
                case "Add":
                    numbersListInteger.add(number);
                    break;
                case "Remove":
                    numbersListInteger.remove(Integer.valueOf(number));
                    break;
                case "RemoveAt":
                    numbersListInteger.remove(number);
                    break;
                case "Insert":
                    numbersListInteger.add(index,number);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(numbersListInteger.toString().replaceAll("[\\[\\],]",""));

    }
}
