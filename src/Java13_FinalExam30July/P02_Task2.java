package Java13_FinalExam30July;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.*;

public class P02_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = Integer.parseInt(scanner.nextLine());
        String inputPass = "";

        for (int i = 0; i < iterations; i++) {
            inputPass = scanner.nextLine();
            String regex ="^(.+)>(?<nums>\\d{3})\\|(?<lowerCase>[a-z]{3})\\|(?<upperCase>[A-Z]{3})\\|(?<last>[^<>]{3})<\\1$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(inputPass);
            if (matcher.find()){
                //StringBuilder enPass = new StringBuilder(inputPass);
                List<String> passwordList = new ArrayList<>();
                passwordList.add(matcher.group("nums"));
                passwordList.add(matcher.group("lowerCase"));
                passwordList.add(matcher.group("upperCase"));
                passwordList.add(matcher.group("last"));
                System.out.printf("Password: %s%n",String.join("",passwordList));

            } else if (!matcher.find()) {
                System.out.println("Try another password!");
            }

        }


    }
}
