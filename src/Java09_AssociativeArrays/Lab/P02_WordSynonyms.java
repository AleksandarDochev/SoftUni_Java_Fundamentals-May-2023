package Java09_AssociativeArrays.Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations =Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<String>> wordsMap = new LinkedHashMap<>();

        for (int i = 0; i < iterations; i++) {
            String word =scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!wordsMap.containsKey(word)){
                wordsMap.put(word,new ArrayList<>());
            }
            wordsMap.get(word).add(synonym);
        }
        for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ", entry.getValue()));
        }

    }
}
