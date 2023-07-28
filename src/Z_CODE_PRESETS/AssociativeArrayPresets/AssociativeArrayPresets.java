package Z_CODE_PRESETS.AssociativeArrayPresets;

import java.util.*;

public class AssociativeArrayPresets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        //Creating Hash map=------------------------

        //      on position one we have what type of Data all of our "Keys"
        // are going to be in this HasMap
        //             on position 2 we have what type of Data will all our acossiated
        //        value to the key will be
        //
        //Linked Hasmap have structure , from A-z from 1 to10 etc.
        LinkedHashMap<String,Integer> linkedHashMapNameInCode = new LinkedHashMap<>();
        HashMap<String,Integer> hashMapNameInCode = new HashMap<>();
        //Creating Hash map=------------------------


        //populating hashmap with data with .put()----------------------
        //we give key string and value integer
        hashMapNameInCode.put("Boeng 23434",130);
        hashMapNameInCode.put("Svuma",4);

        linkedHashMapNameInCode.put("Boeng 23434",130);
        linkedHashMapNameInCode.put("Svuma",4);
        //if we have HashMap with dublicate keys the last value given to the dublicate key is taken
        linkedHashMapNameInCode.put("Svuma",564);

         //populating hashmap with data with .put()------------------

        //removing  data from hasmap ---------------------------------
        // always done when we remove the key
        linkedHashMapNameInCode.remove("Svuma");
        //we can remove the key using the value
        linkedHashMapNameInCode.remove("564");
        //removing  data from hasmap ---------------------------------

        //adding data to hash map if not prest with a check
        if (!hashMapNameInCode.containsKey("ass")){
            hashMapNameInCode.put("ass",69);
        }
        //adding data to hash map if not prest with a check

        //creating Map only hashmap -----------------
        Map<String,String> newMap = new HashMap<>();
        //creating Map only hashmap -----------------

        //creating TreeMap hashMap--------------
        // this map sorts elemnts like the Linked map just in a dirrefert way
        TreeMap<String,Integer> hashMapTree = new TreeMap<>();
        //creating TreeMap hashMap--------------

        //Iteration in HashMap & print HashMap---------------------------------------

        LinkedHashMap<String,Integer> linkedHashMapNameInCode2 = new LinkedHashMap<>();
        linkedHashMapNameInCode2.put("blallsda",130);
        linkedHashMapNameInCode2.put("Svuma",4);
        linkedHashMapNameInCode2.entrySet();
        // then we click "Show context Actions"
        //and we select iterate we get \/
        for (Map.Entry<String, Integer> entry : linkedHashMapNameInCode2.entrySet()) {
            System.out.printf("%s - %d%n",entry.getKey(),entry.getValue());
        }

        //Iteration in HashMap & print HashMap---------------------------------------



//        LinkedHashMap<String, List<Integer>> hashMapWithListAsValue = new LinkedHashMap<>();
//        hashMapWithListAsValue.put("ass",List.of());

    }
}
