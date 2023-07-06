package BasicSyntax.code.Lab;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int allMinOriginal = (hour * 60) + min;
        int allMinOriginalPlus30 = allMinOriginal+30;

        int minsAFTER = allMinOriginalPlus30 % 60; //delenie s ostatuk 136 /60 = 16
        int hoursAFTER = allMinOriginalPlus30 / 60; //delenie 136 = 2
        if (allMinOriginalPlus30 >= 1440){
            hoursAFTER = 0;
        }
        System.out.printf("%d:%02d",hoursAFTER,minsAFTER);
                            // /\ there zero is what to put after the (deciamal number up front)
                            // /\ the 2 is the number of in this case  "0" to put
    }
}
