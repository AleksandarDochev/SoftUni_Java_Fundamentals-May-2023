package Java11_RegularExpressions.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String regex ="\\+359([ |-])2\\1[0-9]{3}\\1[0-9]{4}\\b"; //Regex pattern
        Pattern pattern = Pattern.compile(regex); //Regex pattern compiler for Java
        Matcher matcher = pattern.matcher(inputText); //we get the compiled regex and we applie it to a input and we save the result to a matcher
        //boolean that gives true if text is founf or flase if it isn't
        List<String> validPhoneNumbers = new ArrayList<>();
        while (matcher.find()){
            validPhoneNumbers.add(matcher.group());
            }
        System.out.println(String.join(", ",validPhoneNumbers));
        //reason why we print out a list is to avoid printing a , at the end
        //we only put comma between elements
    }
}
