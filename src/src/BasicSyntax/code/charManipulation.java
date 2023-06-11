package src.BasicSyntax.code;

public class charManipulation {
    public static void main(String[] args) {
        String word = "Desislava";
        System.out.println(word.length());//broi na sumvolite
        System.out.println(word.charAt(0));//puwa bukva
        System.out.println(word.charAt(word.length() - 1));//posledna bukwa

        //length is 9 characters BUT
        //chars are not position like that
        //because we count form position 0 so at Desislava has  length 9
        //but position 0 to 8 because we start counting from 0

    }
}
