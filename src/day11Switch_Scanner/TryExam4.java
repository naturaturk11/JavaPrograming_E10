package day11Switch_Scanner;

public class TryExam4 {
    public static void main(String[] args) {
        /** number of days
         28 days: 2
         30 days: 4,6,9,11
         31 days: 1,3,5,7,8,10,12
         */
        int year = 2000;
        String result = "";
        int number = 1;
        if (number >= 1 && number <= 12) {
            switch (number) {
                case 2:
                    result = (year % 4== 0) ? "29 days" : " 28 days";
                    break;

                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    break;

                default:
                    result = "31 days";
            }
        }else {result = "invalid numbers";}

        System.out.println("result = " + result);


    }



}

