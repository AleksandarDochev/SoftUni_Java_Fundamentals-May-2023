package Java12_FinalExamPrep.J19July2023;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PO3_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> plantRarityMap = new HashMap<>();
        Map<String,Double> rateMap = new HashMap<>();
        for (int i = 0; i < iterations; i++) {
            String[] tokens =scanner.nextLine().split("<->");
            String plant =tokens[0];
            int rarity =Integer.parseInt(tokens[1]);
            plantRarityMap.put(plant,rarity);
            rateMap.put(plant,0.0); // we put 0 so we have a key for that plant

        }
        String inputLine =scanner.nextLine();
        while (!inputLine.equals("Exhibition")){
            String[] tokens = scanner.nextLine().split("[: -]+");//we write a regex for 3 passabilities : - and if they are more than 1
            String command =tokens[0];
            String plant =tokens[1];

            //!!!
            if (!plantRarityMap.containsKey(plant)){
                System.out.println("error");
            }else {
                if (command.equals("Rate")){
                    double rate = Double.parseDouble(tokens[2]);
                    if (rateMap.get(plant) == 0){
                        rateMap.put(plant,rate);
                    }else {
                        double  newRate = (rateMap.get(plant)+rate)/2;
                        rateMap.put(plant,newRate);
                    }
                } else if (command.equals("Update")) {
                    
                } else if (command.equals("Reset")) {
                    
                }else {
                    System.out.println("error");
                }
            }

            inputLine=scanner.nextLine();
        }
        System.out.println();
    }
}
