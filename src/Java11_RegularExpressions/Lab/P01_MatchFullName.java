package Java11_RegularExpressions.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String regex ="\\b(?<FirstName>[A-Z][a-z]+) (?<SecondName>[A-Z][a-z]+)\\b"; //Regex pattern
        Pattern pattern = Pattern.compile(regex); //Regex pattern compiler for Java
        Matcher matcher = pattern.matcher(inputText); //we get the compiled regex and we applie it to a input and we save the result to a matcher
        //boolean that gives true if text is founf or flase if it isn't
        while (matcher.find()){ //so while matcher is true(by default) that's why we don't write =true
            System.out.print(matcher.group()+" ");//we print out groups stored in the matcher starting from group1
        }

    }
}
