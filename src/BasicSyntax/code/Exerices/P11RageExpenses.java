package BasicSyntax.code.Exerices;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGame = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());

        double expenses=0;


        int trashingHeadset = lostGame/2;
        int mouseTrash = lostGame/3;
        int keyboardTrash = lostGame/6;
        int displayTrash = keyboardTrash/2;

        expenses = (trashingHeadset*headset)+
                   (mouseTrash*mouse)+
                   (keyboardTrash*keyboard)+
                   (displayTrash*display);



        System.out.printf("Rage expenses: %.2f lv.\n",expenses);

//        System.out.printf("Trashed headset -> %d times\n",trashingHeadset);
//        System.out.printf("Trashed mouse -> %d times\n",mouseTrash);
//        System.out.printf("Trashed keyboard -> %d times\n",keyboardTrash);
//        System.out.printf("Trashed display -> %d times\n",displayTrash);
    }
}
