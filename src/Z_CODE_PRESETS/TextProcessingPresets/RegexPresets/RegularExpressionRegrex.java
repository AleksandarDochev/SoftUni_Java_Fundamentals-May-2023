package Z_CODE_PRESETS.TextProcessingPresets.RegexPresets;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionRegrex {
    public static void main(String[] args) {



        //Matcher when to use while and if statements -----------------------
        String dataFromInput ="=Hawai=/Cyprus/=Invalid/invalid==i5valid=/I5valid/=i=";
        String regexStringRegex101 ="([=\\/])(?<destination>[A=Z][a-zA-Z]{2,})\\1";//some horrible gibberish
        Pattern pattern23=Pattern.compile(regexStringRegex101);//we use the patter to compile or Regex code
        //in this case matcher has more than 1 element
        Matcher matcher = pattern23.matcher(dataFromInput);
        //we use while for matcher when we want to check more thant 1 elemtn in the matcher
        //and we use IF for the matcher if there is only one element in it
        while (matcher.find()){
            //bla bla
        }
        //Matcher when to use while and if statements -----------------------




    }
}
