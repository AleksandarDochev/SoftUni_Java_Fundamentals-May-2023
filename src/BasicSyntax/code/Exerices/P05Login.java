package BasicSyntax.code.Exerices;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        int wrongs =0;

        for (int position = username.length()-1;position >=0;position--){
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }

        String enteredPassword = scanner.nextLine();
        while (!enteredPassword.equals(password)){
            wrongs ++;
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
            if (wrongs==3){
                break;
            }
        }

        if (enteredPassword.equals(password)){
            System.out.printf("User %s logged in.",username);
        } else if (!enteredPassword.equals(password)) {
            System.out.printf("User %s blocked!",username);
        }


    }
}
