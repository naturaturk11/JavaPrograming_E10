package day8IfStatementsWithMuhtar;

public class NumberOfDaysInTheMonths {

    public static void main(String[] args) {

        int number=5;//valid number were given....1-12
        boolean has28Days=number==2;//for the month that has 28 days
        boolean has30Days= number==4||number==6|| number==9|| number==11;
        boolean has31Days= !has28Days && ! has30Days;//another statement type here were used instead of classic ones

        if(has28Days){
            System.out.println("28 Days ");}
        if(has30Days){
            System.out.println(" 30 Days");}
        if (has31Days){
            System.out.println( "31 Days ");}






    }



}
