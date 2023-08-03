package Java14_MidTermRetake03August;

import java.util.Scanner;

public class Task1_RetakeMidTerm0308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sizeSide = Double.parseDouble(scanner.nextLine());
        int numPaperSheets = Integer.parseInt(scanner.nextLine());

        double areaSize= 6*sizeSide*sizeSide;
        double areaSizeLeft =6*sizeSide;
        double areaCurrentlyCovered =0;
        //double[] sizeOfSheets =new double[]{};

        for (int i = 1; i <= numPaperSheets; i++) {
            double lengthPaperSheet = Double.parseDouble(scanner.nextLine());
            double widthPaperSheet = Double.parseDouble(scanner.nextLine());

            if (i%3==0){//Every 3rd sheet - 25%
                double quaterOfArea = (lengthPaperSheet*widthPaperSheet)*0.25;
                //sizeOfSheets[i]=lengthPaperSheet*widthPaperSheet-quaterOfArea;
                areaCurrentlyCovered+=lengthPaperSheet*widthPaperSheet-quaterOfArea;
            } else if (i%5==0) {//Every 5th sheet
                continue;
            } else {
                //sizeOfSheets[i]=lengthPaperSheet*widthPaperSheet;
                areaCurrentlyCovered +=lengthPaperSheet*widthPaperSheet;
            }
            //areaSizeLeft= areaSize-sizeOfSheets[i];
        }

        double totalAreaCovered = (areaCurrentlyCovered/areaSize)*100;
        if (areaSize>areaCurrentlyCovered){
            System.out.printf("You are out of paper!%n");
            System.out.printf("%.2f%% of the box is not covered.",100-totalAreaCovered);
        } else if (areaSize<areaCurrentlyCovered) {
            double warpLeft=((areaCurrentlyCovered-areaSize)/areaCurrentlyCovered)*100;
            System.out.printf("You've covered the gift box!%n");
            System.out.printf("%.2f%% wrap paper left.",warpLeft);

        }


    }
}
