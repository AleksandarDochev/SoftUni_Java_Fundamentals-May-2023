package Java09_FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_DestinationMapper {
    //https://judge.softuni.org/Contests/Practice/Index/2518#1
    //https://regex101.com/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allDestinations = scanner.nextLine();
        String regex ="([=\\/])(?<destination>[A-Z][a-zA-Z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        //In the matcher we have a sum of all the texts whom are part of the regex 6ablon
        //also know as valid destinations
        //"=Hawai=/Cyprus/=Invalid/invalid==i5valid=/I5valid/=i="
        //matcher= ["=Hawai=","/Cyprus/"]
        Matcher matcher = pattern.matcher(allDestinations);
        List<String> validDestination = new ArrayList<>();
        while (matcher.find()){
            String destination =matcher.group("destination");
            validDestination.add(destination);
        }
        System.out.println("Destinations: "+String.join(", ",validDestination));
        int travelPoints =0;
        for (String destination : validDestination){
            travelPoints+=destination.length();
        }
        System.out.println("Travel Points: "+travelPoints);
    }
}
