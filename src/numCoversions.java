import java.math.BigDecimal;

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


    }
}
