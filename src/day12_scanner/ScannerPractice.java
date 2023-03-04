package day12_scanner;


//import java.util.*;//NOT RECOMMENDED WİLD IMPORT:IMPORTS EVERYTHİNG FROM M THE PACKAGE
import java.util.Scanner;//regular import means imports one class

public class ScannerPractice {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a number between 1 to 7:");
        int num = scan.nextInt();
        String result="";
        if (num >= 1 && num <= 7) {

            result = (num == 1) ? " monday" : (num == 2) ? "tuesday" : (num == 3) ? "wednesday" : (num == 4) ? "thursday" : (num == 5) ? "friday"
                    : (num == 7) ? "saturday" : " sunday";

        } else
            result = " invalid number";
        System.out.println(result);


        scan.close();//at the of the performing should be added close





    }}
