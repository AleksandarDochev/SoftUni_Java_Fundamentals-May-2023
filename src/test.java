import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {


        List<Integer> numList5765 = new ArrayList<>(Arrays.asList(5,5,6,78,876));
        System.out.println(numList5765);
        System.out.println(numList5765.toString().replaceAll("[\\[\\],]",""));

    }
}
