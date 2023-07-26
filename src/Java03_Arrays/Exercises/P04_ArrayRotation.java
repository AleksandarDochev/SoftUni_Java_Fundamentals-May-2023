package Java03_Arrays.Exercises;

import java.util.Scanner;

public class P04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine() //"51 47 32 61 21"
                              .split(" ");  //["51","47","32","61","21"]
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int rotations = 0; rotations < countRotations; rotations++) {
            //massive rotation
            //we take element 1
            String firstElement = array[0];
            //we move the elements to the left , we take the massive without the last one
            //and we move it ["51","47","32","61","21"] -> ["47","32","61","21","21"]
            for (int index = 0; index < array.length-1; index++) {
                array[index] =array[index+1];
            }
            //i set the the first element on last place
            array[array.length-1] = firstElement;
        }
        for (String element : array){
            System.out.print(element + " ");  //This prints out massives by each element
        }
        //System.out.print(String.join(" ",array));//This only work for String printouts

    }
}
