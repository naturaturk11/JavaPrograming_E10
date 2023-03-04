package day17WhileDoWhile;

import java.util.Scanner;

public class Password3times {
    public static void main(String[] args) {

        // while loop password checker, 3 guess

            String password = "Cydeo123!";
            Scanner scanner = new Scanner(System.in);
            int guessNo = 0;

            while (true){
                System.out.println("Please enter your password");
                String guess = scanner.nextLine();
                if (guess.equals(password)){
                    System.out.println("Welcome to dashboard");
                    break;
                }
                guessNo++;
                if(guessNo == 3){
                    System.out.println("Your account is deactivated");
                    break;
                }
            }







    }
}
