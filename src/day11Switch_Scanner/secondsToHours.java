package day11Switch_Scanner;

import java.util.Scanner;

public class secondsToHours {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);



                //WRITE YOUR CODE BELOW:


                System.out.println("Enter seconds:");
                int inputSeconds=input.nextInt();
                int hours, minutes,seconds=0;

                hours=inputSeconds/3600;
                minutes=(inputSeconds%3600)/60;
                seconds=(inputSeconds%3600)%60;
                System.out.println(hours +" hours, "+minutes+" minutes, "+"and "
                        +seconds+" seconds");






    }
}
