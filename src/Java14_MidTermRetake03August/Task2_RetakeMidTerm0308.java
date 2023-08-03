package Java14_MidTermRetake03August;

import java.util.*;
import java.util.stream.Collectors;

public class Task2_RetakeMidTerm0308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputInitial = scanner.nextLine();
        List<Integer> numbersListInteger = Arrays
                .stream(inputInitial.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
//        int [] numbersArr = Arrays.stream(scanner.nextLine()          //"1 4 3 2"
//                        .split(" "))                     //["1","4","3","2"]
//                         .mapToInt(Integer::parseInt)           //[1,4,3,2]
//                        .toArray();

        String commandInput = scanner.nextLine();
        while (!commandInput.equals("END")){
            String[] command =commandInput.split(" ");
            if (commandInput.contains("add")){
                for (int i = 0; i < command.length-3; i++) {

                    numbersListInteger.add(Integer.valueOf(command[i+3]));
                    //numbersListInteger.set(i, Integer.valueOf(command[i+3]));
                }
            } else if (commandInput.contains("remove greater than")) {
                int removeValue = Integer.parseInt(command[3]);
//                for (int i = 0; i < numbersListInteger.size(); i++) {
//                    String currentNumString= String.valueOf(numbersListInteger.get(i));
//                    int currentNum =numbersListInteger.get(i);
//                    if (currentNum>removeValue){
//                        numbersListInteger.remove(currentNumString);
//                    }
//                }
                numbersListInteger.removeIf(e -> e >removeValue);
//                for (Integer item: numbersListInteger) {
//                    if (item > removeValue){
//                        numbersListInteger.remove(item);
//                    }
//                }
            } else if (commandInput.contains("replace")) {
                int valueToReplace = Integer.parseInt(command[1]);
                int replacement = Integer.parseInt(command[2]);
                for (int i = 0; i < numbersListInteger.size(); i++) {
                    //check if index is valid index
                    if (valueToReplace==numbersListInteger.get(i)){
                        numbersListInteger.set(i,replacement);
                        break;
                    }
                }
            } else if (commandInput.contains("remove at index")) {
                int indexToRemove = Integer.parseInt(command[3]);
                //check if index is valid
                if (numbersListInteger.size()>indexToRemove){
                    //String onjectTOREmove = String.valueOf(numbersListInteger.get(indexToRemove));
                    numbersListInteger.remove(indexToRemove);
                }
            } else if (commandInput.contains("find even")) {
                List<Integer> myList = new ArrayList<>();


                for (Integer item : numbersListInteger) {


                    if (item % 2 == 0) {//its even
                        myList.add(item);
                        //System.out.print(item + " ");
                    }

                }
                List<Integer> sortedList = myList.stream()
                        .sorted()
                        .collect(Collectors.toList());
                for (int item: sortedList) {
                    //System.out.print(item+" ");
                }
                System.out.print(sortedList.toString().replaceAll("[\\[\\],]",""));//[5, 5, 6, 78, 876] -> 5 5 6 78 876

            }else if (commandInput.contains("find odd")) {
                List<Integer> myList = new ArrayList<>();

                for (Integer item : numbersListInteger) {


                    if (item % 2 == 1) {//its even
                        myList.add(item);
                        //System.out.print(item + " ");
                    }

                }
                List<Integer> sortedList = myList.stream()
                        .sorted()
                        .collect(Collectors.toList());
                for (int item: sortedList) {
                    //System.out.print(item+" ");
                }
                System.out.print(sortedList.toString().replaceAll("[\\[\\],]",""));//[5, 5, 6, 78, 876] -> 5 5 6 78 876

            }
//            if (commandInput.contains("add")){
//                for (int i = 0; i <= numbersArr.length-3; i++) {
//                    numbersArr[i]= Integer.parseInt(command[i+3]);
//                }
//            }
            commandInput =scanner.nextLine();

        }
        List<String> numbersListString = new ArrayList<>();
        //
        List<Integer> myList = new ArrayList<>();
        for (Integer item:numbersListInteger) {
            myList.add(item);
        }
        List<Integer> sortedNumbersIntegers = myList.stream()
                .sorted()
                .collect(Collectors.toList());
        //
        for (Integer item:numbersListInteger) {
            numbersListString.add(String.valueOf(item));
        }

        System.out.println("\n"+String.join(", ",numbersListString));
        //System.out.println("\n"+numbersListInteger.toString().replaceAll("[\\[\\],]",""));//[5, 5, 6, 78, 876] -> 5 5 6 78 876



    }
}
