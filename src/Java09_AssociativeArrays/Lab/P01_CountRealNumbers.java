package Java09_AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double[] numbersArr = Arrays.stream(input.split(" ")).mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double,Integer> hashMapCounter = new TreeMap<>();
        double oldNum;

        int numberOfSameElement=0;
        for (double element:numbersArr) {
            if (!hashMapCounter.containsKey(element)){
                hashMapCounter.put(element,0);
            }
            //we get the Key of the hasmap we gettting it out with .get and we add 1
            //then we sent it back in
            hashMapCounter.put(element,hashMapCounter.get(element)+1);
        }
        for (Map.Entry<Double, Integer> doubleIntegerEntry : hashMapCounter.entrySet()) {
            System.out.printf("%.0f -> %d %n",doubleIntegerEntry.getKey(),doubleIntegerEntry.getValue());
        }

    }
}
