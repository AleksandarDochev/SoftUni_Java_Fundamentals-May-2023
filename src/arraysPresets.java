import java.util.Arrays;
import java.util.Scanner;

public class arraysPresets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //Arrays presets Integer array , setting length ,filling it with data on each position , reading it out backwards -----------------------------------------
        int num = Integer.parseInt(scanner.nextLine());
        int[] numbersArr = new int[num]; //massive n here is the amount of elements
        for (int i = 0; i < numbersArr.length ; i++) {
            numbersArr[i] = Integer.parseInt(scanner.nextLine());
            //numbersArr[we take the position of the element] and we tell what the number is going to go there
        }

        for (int i = numbersArr.length; i > 0; i--) {
            System.out.printf("%d ",numbersArr[i-1]);
        }
        //Arrays presets Integer array , setting length ,filling it with data on each position , reading it out backwards -----------------------------------------

        //Arrays transfer String array to int array      Way 1------------------------------------------------------------------------
        String input = scanner.nextLine();

        //we create a String array and it scans the whole line it automatically gets it length
        //by the amount of data give and differentiates  with a " " in between symbols
        String[] inputArrString = input.split(" ");

        //we create an int array with the length of the String array
        int[] numbersArr2 = new int[inputArrString.length];

        for (int i = 0; i < numbersArr2.length; i++) {
            //we say for each position of the int array starting to zero ending at the length
            //we parse and put the data from the same position from the String array
            numbersArr2[i] = Integer.parseInt(inputArrString[i]);
        }
        //Arrays transfer String array to int array      Way 1------------------------------------------------------------------------

        //Arrays transfer String array to int array      Way 2------------------------------------------------------------------------
        String input2 = scanner.nextLine();
        //we make int array we get the input and we split with space " " , then we map it to every element "e" and we send it back
        int[] numbersArrFromString = Arrays.stream(input2.split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        //Arrays transfer String array to int array      Way 1------------------------------------------------------------------------


    }
}
