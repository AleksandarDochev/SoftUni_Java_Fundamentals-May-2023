package Java14_MidTermRetake03August;

import java.util.*;
import java.util.stream.Collectors;

public class Task3_RetakeMidTerm0308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputInitial = scanner.nextLine();
        List<String> spicesList = Arrays.stream(inputInitial.split(", ")).collect(Collectors.toList());

        String inputCommand= scanner.nextLine();
        while (!inputCommand.equals("done")){


            if (inputCommand.contains("AddSpice")){
                String[] command =inputCommand.split(" ");
                spicesList.add(command[1]);
            } else if (inputCommand.contains("AddManySpices")) {
                String[] command =inputCommand.split(" ");
                int putListOnindex = Integer.parseInt(command[1]);
                List<String> innerSpicesList = Arrays.stream(command[2].split("\\|")).collect(Collectors.toList());
                spicesList.add(putListOnindex, String.valueOf(innerSpicesList));
            } else if (inputCommand.contains("SwapSpices")) {
                String[] command =inputCommand.split(" ");
                String spiceOld = command[1];
                String spiceNew = command[2];
                for (int i = 0; i < spicesList.size(); i++) {
                    //replace old with new
                    if (spicesList.get(i).equals(spiceOld)){
                        spicesList.remove(i);
                        spicesList.add(i,spiceNew);
                        continue;
                    } else if (spicesList.get(i).equals(spiceNew)) {
                        spicesList.remove(i);
                        spicesList.add(i,spiceOld);
                    }
                    
                }
            } else if (inputCommand.contains("ThrowAwaySpices")) {
                String[] command =inputCommand.split(" ");
                int spiceStartingIndex = spicesList.indexOf(command[1]);
                int spiceEndIndex = Integer.parseInt(command[2]);
                for (int i = spiceStartingIndex; i <= spiceEndIndex; i++) {
                    spicesList.remove(spiceStartingIndex);
                }

            } else if (inputCommand.contains("Arrange")) {
                Collections.sort(spicesList);
            }

            inputCommand=scanner.nextLine();
        }
        System.out.println(spicesList.toString().replaceAll("[\\[\\],]",""));
        //System.out.println(String.join(" ",spicesList));//prints out sorted


    }
}
