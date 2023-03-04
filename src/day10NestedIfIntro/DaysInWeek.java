package day10NestedIfIntro;

public class DaysInWeek {

    public static void main(String[] args) {

        int n1=5;

        String day;
        if (n1 == 1) {day = "Monday";}
        else if (n1 == 2) {day="Tuesday";}
        else if(n1==3){day="Wednsday";}
        else if (n1==4){day="Thursday";}
        else if (n1==5){day="Friday";}
        else if (n1==6){day="Saturday";}
        else {day=" Sunday";}

        System.out.println("day = " + day);


        System.out.println("..............................................");



        String result =(n1==1)? "Monday":(n1==2)? "Tuesday" :(n1==3)? "Wednsday":(n1==4)? "Thursday"
                :(n1==5)? "Friday":(n1==6)? "Saturday" : "Sunday";



        System.out.println(result);




    }



}
