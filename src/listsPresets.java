import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listsPresets {
    public static void main(String[] args) {



        //----------Creating new empty dynamic list--------------------
        List<String> wordsList = new ArrayList<>();
        wordsList.add("ass");
        wordsList.add("bigass");

        for (String e :wordsList) {
            System.out.println(e);
        }
        //----------Creating new empty dynamic list--------------------

        List<String> wordsList2 = new ArrayList<>(Arrays.asList("Ver","Ger","Maria"));
        wordsList2.remove("Maria");





    }
}
