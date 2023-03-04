package day11Switch_Scanner;

public class NumberOfDaysINMonth {
    public static void main(String[] args) {

        /** number of days
         28 days: 2
         30 days: 4,6,9,11
         31 days: 1,3,5,7,8,10,12
         */
         int year= 2000;

        int number= 8;
        String result= "";

        if(number>=1 && number<=12){

            switch (number){
                case 2:
                    result=(year % 4==0)? "29 days": " 28 days";


                    break;



                case 4: case 6: case 9: case 11:/** at the same line with same
                     numbers could be written as such*/
                   result= "30 days";
                    break;
                default:
                   result=" 31 days";
                    break;
            }
            System.out.println(result);
            }else result= " ınvalid";}









    }






