package MidTermExam;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String friendsLineScan = scanner.nextLine();
        int blacklistCounter =0;
        List<String> listOfFriends =Arrays.stream(friendsLineScan.split(", "))
                .collect(Collectors.toList());

        String blacklistLineScan = scanner.nextLine();
        List<String> blacklistCommand =Arrays.stream(blacklistLineScan.split(" "))
                .collect(Collectors.toList());
        for (String check : listOfFriends){
            String input = scanner.nextLine();
            if (blacklistCommand.get(1).equals(input)){
                System.out.println("\n"+input+" was black listed");
            }
        }

        System.out.println("\n"+blacklistCommand.get(1)+" was black listed");
        blacklistCounter ++;

        String errorLineScanner = scanner.nextLine();
        List<String> errorCommand =Arrays.stream(errorLineScanner.split(" "))
                .collect(Collectors.toList());



        String lastInputReportScanner = scanner.nextLine();
        while (!lastInputReportScanner.equals("Report")){


            }


        }

    }

