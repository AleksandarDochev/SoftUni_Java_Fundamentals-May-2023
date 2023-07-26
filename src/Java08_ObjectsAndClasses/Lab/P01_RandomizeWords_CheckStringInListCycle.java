package Java08_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class P01_RandomizeWords_CheckStringInListCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArr = scanner.nextLine().split(" ");

        //here we create an object of the class Random
        Random randomObj = new Random();
        //we create the object of the class Random so we can use it's
        //functionalities here \/
//        int variableRandom = randomObj.nextInt(100);
//        System.out.println(variableRandom);

        List<String> wordsListOriginal = new ArrayList<>();
        //I put thwhile cycle to fill the originals list and don't stop running
        //iteration unstill it has the same size of the initial size of the input
        while (wordsListOriginal.size()<wordsArr.length){
            int randomIndex = randomObj.nextInt(wordsArr.length);
            String currentWord = wordsArr[randomIndex];
            if (!wordsListOriginal.contains(currentWord)){
                wordsListOriginal.add(currentWord);
            }
        }
        //if for cycle is use not enough checks are done because the number of iterations
        // is somethimes not enough to run checks on all of the words
//        for (int i = 0; i < wordsArr.length; i++) {
//
//        }
        for (String word :wordsListOriginal) {
            System.out.println(word);
        }
    }
}
