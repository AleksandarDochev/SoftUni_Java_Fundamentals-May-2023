package Java12_FinalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_HeroesOfCodeAndLogicVII {
    //https://judge.softuni.org/Contests/Practice/Index/2303#2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> heroesHealthP = new LinkedHashMap<>();
        Map<String,Integer> heroesManaP = new LinkedHashMap<>();
        int countHeroes = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countHeroes; i++) {
            String heroInfo = scanner.nextLine();
            String[] heroData =heroInfo.split(" ");
            String heroName = heroData[0];
            int hp = Integer.parseInt(heroData[1]);
            int mp = Integer.parseInt(heroData[2]);
            if (hp<=100){
                heroesHealthP.put(heroName,hp);
            }
            if (mp<=200){
                heroesManaP.put(heroName,mp);
            }

        }
        String command =scanner.nextLine();
        while (!command.equals("End")){
            String[] commandPartsArr = command.split(" - ");
            if (commandPartsArr[0].equals("Heal")){
                //"Heal – {hero name} – {amount}"
                String heroName = commandPartsArr[1];
                int heroCurrentHP = heroesHealthP.get(heroName);
                int healAmount =Integer.parseInt(commandPartsArr[2]);
                int hpAfterHeal = heroesHealthP.get(heroName)+healAmount;
                heroesHealthP.remove(heroName,heroCurrentHP);
                heroesHealthP.put(heroName,hpAfterHeal);
                //The hero increases his HP. If a command is given that would bring the HP of the hero above the maximum
                //value (100), HP is increased to 100 (the HP can't go over the maximum value).
                if (heroesHealthP.get(heroName)>100){
                    heroesHealthP.put(heroName,100);
                }
                System.out.printf("\n%s healed for %d HP!",heroName,Math.abs(heroCurrentHP-heroesHealthP.get(heroName)));
            }else if(commandPartsArr[0].equals("Recharge")){
                //"Recharge – {hero name} – {amount}"
                String heroName = commandPartsArr[1];
                int rechargeAmount =Integer.parseInt(commandPartsArr[2]);
                int heroCurrentMP = heroesManaP.get(heroName);
                heroesManaP.remove(heroName,heroCurrentMP);
                int mpAfterRecharge = heroCurrentMP+rechargeAmount;
                heroesManaP.put(heroName,mpAfterRecharge);
                //The hero increases his MP. If it brings the MP of the hero above the maximum value (200), MP is increased
                //to 200. (the MP can't go over the maximum value).
                if (heroesManaP.get(heroName)>200){
                    heroesManaP.put(heroName,200);
                }
                System.out.printf("\n%s recharged for %d MP!",heroName,Math.abs(heroCurrentMP-heroesManaP.get(heroName)));
            }else if(commandPartsArr[0].equals("TakeDamage")){
                //"TakeDamage – {hero name} – {damage} – {attacker}"
                String heroName = commandPartsArr[1];
                int damage =Integer.parseInt(commandPartsArr[2]);
                String attacker = commandPartsArr[3];
                int heroCurrentHP = heroesHealthP.get(heroName);
                int heroHPAfterDamage = heroesHealthP.get(heroName)-damage;
                heroesHealthP.remove(heroName,heroCurrentHP);
                heroesHealthP.put(heroName,heroHPAfterDamage);
                //The hero increases his MP. If it brings the MP of the hero above the maximum value (200), MP is increased
                //to 200. (the MP can't go over the maximum value).
                if (heroesHealthP.get(heroName)<=0){
                    heroesHealthP.remove(heroName);
                    heroesManaP.remove(heroName);
                    System.out.printf("\n%s has been killed by %s!",heroName,attacker);

                } else if (heroesHealthP.get(heroName)>0) {
                    System.out.printf("\n%s was hit for %d HP by %s and now has %d HP left!",heroName,damage,attacker,heroesHealthP.get(heroName));
                }

            } else if (commandPartsArr[0].equals("CastSpell")) {
                //CastSpell - Kyrre - 15 - ViewEarth
                String heroName = commandPartsArr[1];
                int manaUsed =Integer.parseInt(commandPartsArr[2]);
                String spellName = commandPartsArr[3];
                int heroCurrentMP = heroesManaP.get(heroName);
                if (heroCurrentMP<manaUsed){
                    System.out.printf("\n%s does not have enough MP to cast %s!",heroName,spellName);
                } else  {
                    int heroMPAfterCast = heroesManaP.get(heroName)-manaUsed;
                    heroesManaP.remove(heroName,heroCurrentMP);
                    heroesManaP.put(heroName,heroMPAfterCast);
                    System.out.printf("\n%s has successfully cast %s and now has %s MP!",heroName,spellName,heroesManaP.get(heroName));
                }

            }


            command = scanner.nextLine();
        }
        heroesHealthP.entrySet()
                //(key) name of player ->(value) HP points
                .forEach(entry -> {
                             String heroName = entry.getKey();
                             System.out.println(heroName);//print name of player
                             System.out.println("  HP: "+entry.getValue());//print Hp of player
                             System.out.println("  MP: "+heroesManaP.get(heroName));
                        });

    }
}
