package Z_CODE_PRESETS;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class ObjectClassesInstancesPresets {
    class Dice{ // this si a class
        public int sides;
    }
    public void roll(){ // this is a public method
        Random rnd =new Random();
        int side= rnd.nextInt(6);
    }
    public static void main(String[] args) {


        //An example of 3 instances of the same object
        LocalDate birthday1 = LocalDate.of(1996,11,27);
        LocalDate birthday2= LocalDate.of(1997,11,23);
        LocalDate birthday3= LocalDate.of(1956,1,2);
        System.out.println(birthday1+" "+birthday2+" "+birthday3);
        //An example of 3 instances of the same object

        //               "new Scanner" here is we create an instance of this class
        Scanner scanner = new Scanner(System.in);





    }
}
