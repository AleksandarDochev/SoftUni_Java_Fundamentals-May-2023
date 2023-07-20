package List.Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Double> numbersListDouble = Arrays
                .stream(input.split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());


        for (int i = 0; i < numbersListDouble.size()-1; i++) {
            double currentNum = numbersListDouble.get(i);
            double nextNum = numbersListDouble.get(i+1);
            if (currentNum==nextNum){
                numbersListDouble.set(i,currentNum+nextNum);
                numbersListDouble.remove(i+1);
                i=-1;// we add this so we can start the check always from 0
            }
        }
        System.out.println(joinMethodElementsByDelimeter(" ",numbersListDouble));
    }
    public static String joinMethodElementsByDelimeter(String delimeterMethodIntake, List<Double> listDoubleMethodIntake){
        DecimalFormat df= new DecimalFormat("0.###");//12.0000 ->12 12.3454 ->12.346
        String result="";
        for (double item:listDoubleMethodIntake) {
            String numDf=df.format(item)+ delimeterMethodIntake;
            result +=numDf;
        }
        return result;
    }
}
