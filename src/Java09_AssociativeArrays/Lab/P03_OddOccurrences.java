package Java09_AssociativeArrays.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        LinkedHashMap<String,Integer> wordsMap = new LinkedHashMap<>();
        for (String word: inputArr) {
            //for each String element of the arr make it lower case and return it to
            //it with lower case value
            word=word.toLowerCase();
            if (!wordsMap.containsKey(word)){
                wordsMap.put(word,0);
            }
            //we get the value of the key and give it 1 more then we put it back
            wordsMap.put(word,wordsMap.get(word)+1);
        }

        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue()%2==1){
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ",resultList));
    }
}
