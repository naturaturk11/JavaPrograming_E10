package day8IfStatementsWithMuhtar;

public class SinleIfStatemensIntro {


    public static void main(String[] args) {

        int number= 201;
        boolean evenNumber=number%2==0;
        boolean oddNumber= ! evenNumber;// opposite of the first statemnt
        if(evenNumber){
            System.out.println(number+" is even number");

            if(oddNumber) {
                System.out.println(number + " is odd number  ");


            }



        }





    }
}
