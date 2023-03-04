package day20_Array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //create a variable that is capable enough to contain 5 names

        String  myGroups[]=new String[5];//0-4
        myGroups[0]="Gunay";
        myGroups[1]="Neira";
        myGroups[2]="Suat";
        myGroups[3]="Hulya";
        myGroups[4]="Mikael";//if reassigned any variable, the next will print
        //myGroups[-1]="Adam";not be let to be used under zero index... the lowest index in java is 0
        System.out.println(Arrays.toString(myGroups));

        System.out.println(".........................................");


        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //                0        1          2          3           4        5          6
        System.out.println(Arrays.toString(days));

        int number=1;//should be btwn 1-7...it is not equal with index numbers

        if(number<1 || number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number]);









    }
}
