package week2Review09_17_2022;

public class ConvertMinutesToYearAndDay {
   /** . Create class named ConvertMiutesToYearAndDay,
    write a Java program to convert minutes into a number of years and days.

    Input the number of minutes: 3456789
    Expected Output :
            3456789 minutes is approximately 6 years and 210 days*/


   public static void main(String[] args) {

      int givenMinutes = 34567890;
      int howManyMinutesInAYear = (24 * 365 * 60);
      int year = givenMinutes / howManyMinutesInAYear;
      System.out.println("year = " + year);
      int remainderMinutes = givenMinutes % howManyMinutesInAYear;
      System.out.println("remainderMinutes = " + remainderMinutes);
      int days = remainderMinutes / (24 * 60);
      System.out.println("days = " + days);

      System.out.println(givenMinutes+" minutes is approximately "+year+" years and "+days+" days");





/**

 nt minutes = 3456789;
 int hours = minutes / 60;
 int day = hours / 24;
 int year = day / 365;
 int remainder = day % 365;
 this is easy way
 */



   }



}
