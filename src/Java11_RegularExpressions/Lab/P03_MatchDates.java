package Java11_RegularExpressions.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String regex ="\\b(?<day>[0-9]{2})(?<separator>[\\.\\-\\/])(?<mounth>[A-Z][a-z]{2})\\2(?<year>[0-9]{4})\\b"; //Regex pattern
        Pattern pattern = Pattern.compile(regex); //Regex pattern compiler for Java
        Matcher matcher = pattern.matcher(inputText); //we get the compiled regex and we applie it to a input and we save the result to a matcher
        //boolean that gives true if text is founf or flase if it isn't
        //List<String> validDatesList = new ArrayList<>();
        while (matcher.find()){
            System.out.println("Day: "+matcher.group("day")+", Month: "+matcher.group("mounth")+", Year: "+matcher.group("year"));
        }
        //System.out.println(String.join(", ",validDatesList));
        //reason why we print out a list is to avoid printing a , at the end
        //we only put comma between elements

    }
}
