package day27_WrapperClasses;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

      Scanner scanner=new Scanner(System.in);
        int upperCount;
        int lowCount;
        int digitCount;
        int specialCount;
        do {
            upperCount = 0;
            lowCount = 0;
            digitCount = 0;
            specialCount = 0;
            System.out.println("enter a password that contains upperCase letter, lowerCase letter, special character and digit!");
            String password = scanner.next();
            while ((password.length() <= 8)) {
                System.out.println("please enter a password that the length is greater than 8");
                password = scanner.next();
            }
            char passChars[] = password.toCharArray();
            for (char passChar : passChars) {
                if (Character.isUpperCase(passChar)) {
                    upperCount++;
                }
                if (Character.isLowerCase(passChar)) {
                    lowCount++;
                }
                if (Character.isDigit(passChar)) {
                    digitCount++;
                }
                if (!Character.isLetterOrDigit(passChar)) {
                    specialCount++;
                }
            }

        } while (!(specialCount >= 1 && digitCount >= 1 && lowCount >= 1 && upperCount >= 1));
        System.out.println("you have a strong password!");
    }
}


