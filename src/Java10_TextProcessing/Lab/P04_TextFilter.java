package Java10_TextProcessing.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] banWordsArr = scanner.nextLine().split(", ");
        String text=scanner.nextLine();
        List<String> starWord = new ArrayList<>();
        for (String banWord:banWordsArr) {
            String asterix =repeatString(banWord);
            text=text.replace(banWord,asterix);
        }
        System.out.println(text);

    }
    public static String repeatString(String banWord){
        String result="";
        for (int i = 0; i < banWord.length(); i++) {
            result = result+"*";
        }
        return result;
    }
}
