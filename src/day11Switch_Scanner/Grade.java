package day11Switch_Scanner;

public class Grade {
    public static void main(String[] args) {

        char number = 'F';
        switch (number) {
                                  /**String result=" " this is optional if it used ; should be used
                                    result='A' İNSTEAD OF System.out.println('A');*/
            case 'A':
                System.out.println(" Excellent");
                break;

            case 'B':
                System.out.println(" Great");
                break;
            case 'C':
                System.out.println(" Good");
                break;
            case 'D':
                System.out.println(" Passed");
                break;
            case 'F':
                System.out.println(" Failed");
                break;
            default:
                System.out.println(" Invalid grades");


        }


    }
}