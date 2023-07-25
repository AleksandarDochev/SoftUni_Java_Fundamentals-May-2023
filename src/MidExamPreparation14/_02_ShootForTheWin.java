package MidExamPreparation14;

import java.util.Arrays;
import java.util.Scanner;

public class _02_ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] targets = Arrays.stream(scanner.nextLine()           //take is "24 50 36 70" and Arras steam is to spit Whole numbers (without decimals)
                        .split(" "))                          // We split the data from xxxx with one space interval and put in a massive  ["24", "50", "36", "70"]
                        .mapToInt(Integer::parseInt)                //With this we take all the elemnts in ["24", "50", "36", "70"] and we convert them into normal integers [24, 50, 36, 70]
                        .toArray();                                 //With this we create the massive with Whole numbers "цели числа"

        int countShotTargets = 0;

        String input = scanner.nextLine();  //"End" or index under the form of a text
        while (!input.equals("End")){ //if input is no equal to End re-run the cycle and scan the next line
                                      // this cycle will run and re-scan the line as a string
            int shotIndex = Integer.parseInt(input);//take the value from the scanned line "input" and put the data under integer

            if (shotIndex >= 0 && shotIndex <= targets.length-1) {   //we check if the shotIndex in our massive is even valid , if it;s in the massive so is it biggger than the first massive position or samller than the last massive position
                                                             // Valid shotIndex is always the first and the lengh of the massive -1 so [0; length-1]
                int shotTarget = targets[shotIndex]; //target that has been shot
                //after we shoot again we change the value of all other targets
                for (int i = 0; i <= targets.length-1;i++){//we read all targets
                    int currentTarget = targets[i];// we set the current target
                    if (i != shotIndex && targets[i] !=-1){       //change that are not the current one and ones that  who are not == "-1"
                        if (currentTarget > shotTarget) {
                            currentTarget = currentTarget-shotTarget;
                        }else {  //currentTarget <= shotTarget
                            currentTarget = currentTarget+shotTarget;
                        }
                        targets[i] = currentTarget;// we put the new value
                    }

                }
                targets [shotIndex] = -1;//after a target is shot we give a value -1
                countShotTargets ++;
            }
            input=scanner.nextLine();
        }

        System.out.print("Shot targets: " + countShotTargets + " -> ");
        for (int target : targets){
            System.out.print(target + " ");
        }
    }
}
