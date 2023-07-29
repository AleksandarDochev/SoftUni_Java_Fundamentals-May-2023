package Java12_FinalExamPrep.J21July2023;

import java.util.Scanner;

public class P01_TheImitationGame {
    //https://judge.softuni.org/Contests/Practice/Index/2525#0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessages = scanner.nextLine();
        //here we call a String builder and we give it the scanned line
        StringBuilder modifyMessage = new StringBuilder(encryptedMessages);

        String command = scanner.nextLine();
        while (!command.equals("Decode")){
            if (command.contains("Move")){
                //command "Move|5".split("|") -> ["Move" ,"5"]
                int countLetters = Integer.parseInt( command.split("\\|")[1]);//numbers of letter that are going to b moved
                //"Desislava" -> first 5 ->"Desis"
                //we use the String builder the first vcalue is the starting index of the string and second is the end
                String firstLetters = modifyMessage.substring(0,countLetters);//we take the First 5 letters from the message
                modifyMessage.delete(0,countLetters);//we remove the first 5 letters from the message
                //put at the end ->"lava" + "Desis" = lavaDesis
                modifyMessage.append(firstLetters);//we put the 5 letter the message
            } else if (command.contains("Insert")) {
                //command = "Insert|2|Desi".split("|")->["Insert","2","Desi"]
                int index = Integer.parseInt( command.split("\\|")[1]);//index we will insert the value after
                String value =  command.split("\\|")[2];
                //here we use the StringBUilder to insert the value after the index
                modifyMessage.insert(index,value);
            } else if (command.contains("ChangeAll")) {
                //command = "ChangeAll|ab|vr"
                String substring = command.split("\\|")[1];
                String replacement = command.split("\\|")[2];
                String currentMessage = modifyMessage.toString();//we just get the String from the String builder at the point and we save it to a String
                currentMessage = currentMessage.replace(substring,replacement);//we use the regular String function in Java for Sting to just change the Text
                modifyMessage = new StringBuilder(currentMessage);//we get the Main StringBuilder again (that we called in the begging)and we return the modified value back to it

            }
            command =scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s",modifyMessage);
    }
}
