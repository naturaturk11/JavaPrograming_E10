package day11Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 3;

                                         //four types of data boolean,fault,long and double
        switch (number) {//curly braces only   //1-7 days ....the reason wyh switch is used is ability of its performance
                                         // the-only comparison symbol is "==" only.....
            case 1:                     //case value must be unique all time
                System.out.println("Monday");
                break;                  //if needs to exit after executing the case block

            case 2:                    //no curly braces just put colon
                System.out.println("Tuesday");
                                 //if needs to exit after executing the case block

            case 3:
                System.out.println(" Wednesday");
                break;                  //if needs to exit after executing the case block
            case 4:
                System.out.println(" Thursday");
                break;                 //if needs to exit after executing the case block
            case 5:
                System.out.println(" Friday");
                break;                //if needs to exit after executing the case block
            case 6:                  //case value must be unique all time
                System.out.println(" Saturday");
                break;                 /**if needs to exit after executing the case block
                                       break is required ın case we don't more result but only*/
            case 7:
                System.out.println(" Sunday");
                break;

            default:                   /**is not mandatory but optional...it is operated
                                         when none other options  do not work*/
                System.out.println(" Invalid Numbers");
                break;                 /**it is not necessary to add here 'break' bcse we have almost come to
                                        curly braces....
                                         if default be located in other places but not end the "break" should be added*/


        }


    }
}