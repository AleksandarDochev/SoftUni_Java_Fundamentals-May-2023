package Java12_FinalExamPrep.J19July2023;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = Integer.parseInt(scanner.nextLine());

//        Each line must not contain anything else but a valid barcode. A barcode is valid when:
//• Is surrounded with a "@" followed by one or more "#"
//• Is at least 6 characters long (without the surrounding "@" or "#")
//• Starts with a capital letter
//• Contains only letters (lower and upper case) and digits
//• Ends with a capital letter
        String regexValidBarcode ="@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regexValidBarcode);
        Matcher matcher = null;

        for (int i = 0; i < iterations; i++) {
            String barcode=scanner.nextLine();
            matcher = pattern.matcher(barcode);
            if (matcher.find()){ //if we match the barcode
                //Check for digits
                StringBuilder numsProduct = new StringBuilder();
                for (int j = 0; j < barcode.length(); j++) {
                    char symbol = barcode.charAt(j);
                    if (Character.isDigit(symbol)){
                        numsProduct.append(symbol);
                    }
                }
                if (numsProduct.length()==0){
                    System.out.println("Product group: 00");
                }else {
                    System.out.printf("Product group: %s%n",numsProduct.toString());
                }

            }else {
                System.out.println("Invalid barcode");
            }
        }



    }
}
