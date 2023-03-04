package day13StringClass;

import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the word");
        String str = scan.next();
        String sandwich="";
        String afterFirstGone="";






        if(str.contains("bread")){
            afterFirstGone=str.substring(str.indexOf("bread")+5);}
        if(afterFirstGone.contains("bread")) {
            sandwich = str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
            System.out.println(sandwich);

        }else{
            System.out.println("nothing");

        }






    }
}
