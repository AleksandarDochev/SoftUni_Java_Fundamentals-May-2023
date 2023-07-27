package Java09_FinalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_HeroesOfCodeAndLogicVII {
    //https://judge.softuni.org/Contests/Practice/Index/2303#2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> heroHP = new LinkedHashMap<>();
        Map<String,Integer> heroMP = new LinkedHashMap<>();
        int countHeroes = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countHeroes; i++) {
            String heroInfo = scanner.nextLine();
            String[] heroData =heroInfo.split(" ");
            String heroName = heroData[0];
            int hp = Integer.parseInt(heroData[1]);
            int mp = Integer.parseInt(heroData[2]);
            if (hp<=100){
                heroHP.put(heroName,hp);
            }
            if (mp<=200){
                heroMP.put(heroName,mp);
            }

        }


    }
}
