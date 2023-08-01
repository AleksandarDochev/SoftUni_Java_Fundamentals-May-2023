package Java06_MidExamPreparation.June12;

import java.util.*;
import java.util.stream.Collectors;

public class P03_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbersInput = scanner.nextLine();
        List<Integer> numList = Arrays
                .stream(numbersInput.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        double sumNum =0;
        double avgNumber =0;

        List<String> numBiggerThanAvgList = new ArrayList<>();

        for (Integer number:numList) { //calculating sumNum
            sumNum +=number;
        }
        avgNumber= sumNum/numList.size();
        for (Integer number:numList) {//check if numbers bigger than avg number
            if (number>avgNumber){
                String numberToString = number.toString();//conver int to String so we can add to list
                numBiggerThanAvgList.add(numberToString);
            }
        }
        //System.out.printf("Average number = %.0f.\n",avgNumber);
        if (!numBiggerThanAvgList.isEmpty()){
//            System.out.printf("Numbers greater than %d are: {%s}%n",avgNumber,String.join(", ",numBiggerThanAvgList));
            Collections.sort(numBiggerThanAvgList, Collections.reverseOrder());
//            System.out.printf("The top 5 numbers among them in descending order are: {%s}",String.join(", ",numBiggerThanAvgList));
            for (int i = 0; i < Math.min(5, numBiggerThanAvgList.size()); i++) {
                System.out.print(numBiggerThanAvgList.get(i)+" ");
            }

        }else {
            System.out.println("No");
//            System.out.printf("There are no numbers, greater than %d.",avgNumber);
        }

    }
}
