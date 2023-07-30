package Java13_FinalExam30July;

import java.util.*;

public class P03_Task3 {
    //https://judge.softuni.org/Contests/Compete/Index/4080
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();

        LinkedHashMap<String, List<String>> likesMap = new LinkedHashMap<>();
        int unlikedMeansCount=0;
        //Map<String, List<String>> likesMap = new HashMap<>();
        Map<String, List<String>> dislikesMap = new HashMap<>();
        while (!input.equals("Stop")) {

            String[] command =input.split("-");

            if (command[0].equals("Like")){
                if (!likesMap.containsKey(command[1])){//if guest doesn't exist
                    likesMap.put(command[1], new ArrayList<>());//adds list guest and list
                }
                //we get values and check them

                //
                likesMap.get(command[1]).add(command[2]);//we add meal to guest likes list


            } else if (command[0].equals("Dislike")) {
                String guestName = command[1];
                String meal = command[2];
                likesMap.put(command[1], new ArrayList<>());
                if (!dislikesMap.containsKey(guestName)){
                    dislikesMap.put(guestName, new ArrayList<>());
                }
                if (!likesMap.containsKey(guestName)){
                    System.out.printf("%n%s is not at the party.",guestName);
                }
                //check if the guest has the meal in likes list
                likesMap.get(guestName).remove(meal);
                System.out.printf("%s doesn't like the fish.%n",guestName);
                unlikedMeansCount++;
                if (likesMap.get(guestName).contains(meal)){
                    System.out.printf("%n%s doesn't have the %s in his/her collection.",guestName,meal);
                }


            }
            input=scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : likesMap.entrySet()) {
            System.out.printf("%s: %s%n",entry.getKey(),String.join(", ", entry.getValue()));//likes
        }
        System.out.printf("Unliked meals: %d",unlikedMeansCount);


    }
}
