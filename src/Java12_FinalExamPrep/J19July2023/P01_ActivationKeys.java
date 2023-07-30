package Java12_FinalExamPrep.J19July2023;

import java.util.Scanner;

public class P01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKeys = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Generate")){
            String[] tokens = input.split(">>>");
            String command = tokens[0];
            String substring ="";
            int startIndex=0;
            int endIndex=0;
            switch (command){
                case "Contains":
                    substring = tokens[1];//what to check
                    if (activationKeys.contains(substring)){
                        System.out.printf("%s contains %s%n",activationKeys,substring);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = tokens[1];

                    startIndex = Integer.parseInt(tokens[2]);
                    endIndex=Integer.parseInt(tokens[3]);
                    substring = activationKeys.substring(startIndex,endIndex);

                    if (upperOrLower.equals("Upper")){
                        activationKeys = activationKeys.replace(substring,substring.toUpperCase());

                    }else {
                        activationKeys = activationKeys.replace(substring,substring.toLowerCase());

                    }
                    System.out.println(activationKeys);
                    break;
                case "Slice":
                    startIndex = Integer.parseInt(tokens[1]);
                    endIndex=Integer.parseInt(tokens[2]);
                    substring = activationKeys.substring(startIndex,endIndex);//we rember what we need to slice
                    //this how we remove a substring from a string , we replace it with noting
                    activationKeys = activationKeys.replace(substring,"");
                    System.out.println(activationKeys);
                    break;
            }
            input=scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n",activationKeys);

    }
}
