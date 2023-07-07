import java.math.BigDecimal;
import java.util.Scanner;

public class numCoversions {
    public static void main(String[] args) {

        ////////////-NUMBER cast ,casting -----------------
        double numDouble = 3.4465;
        //"Conversion of double to int with data loss of .4465"


        System.out.println((int)numDouble);
         ////////////-NUMBER cast ,casting -----------------

        ////////////////////////////- NUMBER cas double to integer-
        double years = 100;
        int intYears =(int)years;
        System.out.printf("\nDouble : %s " +
                          "\nInt conversion : %d " +
                          "\n",years,intYears);

        ////////////////////////////- NUMBER cas double to integer-

        ////////////////-BigDecimal calculation for finances , high precision , very high numbers-----------
        double bigNumber = 787685.65 * 34325235 *60;
        BigDecimal extremelyBigNumber = new BigDecimal(bigNumber); //normal
        BigDecimal extremelyBigNumberCast = new BigDecimal((int)bigNumber); // cast double to int here
        System.out.printf("\nbigNumber with errors : %s " +
                "\nNormal big number conversion precise : %s " +
                "\nCasted big number conversion to int  : %s",bigNumber,extremelyBigNumber,extremelyBigNumberCast);
        ////////////////-BigDecimal calculation for finances , high precision , very high numbers-----------

        /////////////// -- Print float or double like a normal number like decimal float ot int print
        double doublebig = 4534656 * 34352;
        float floatbig   = 4534656 * 34352;
        System.out.printf("\ndoublebig : %.0f \nfloatbig : %.0f \n",doublebig,floatbig);
        /////////////// -- Print float or double like a normal number like decimal float ot int print

        /////------take numbers from last position of saved int number --------
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (inputNumber>0){

            int lastDigit = inputNumber % 10;       //how to get the last digit from a number
            int sumAndLastDigit = sum + lastDigit ;
            inputNumber = inputNumber / 10;        //How to remove the last digit from and int number
        }
        /////------take numbers from last position of saved int number --------

    }
}
