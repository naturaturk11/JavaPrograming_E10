package day13StringClass;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
/*
        String a="hello_11@gmail.com";


        a=a.substring(a.indexOf("_"),a.indexOf("."));
        System.out.println(a);
*/







        Scanner scan = new Scanner(System.in);
        System.out.println("write your email");
        String email = scan.next();
        String result="";

        String firstName=email.substring(0,email.indexOf("_")).toLowerCase();


        String firstName2=firstName.substring(0,1).toUpperCase();
        firstName=email.substring(1,email.indexOf("_"));
        System.out.println(firstName);
        System.out.println("first name:"+firstName2+firstName);


/*
        String lastname=email.substring(email.indexOf("_")+1,email.indexOf("@"));

        lastname=lastname.toLowerCase();
        String lastname2=email.substring(0,1).toUpperCase();

        String rest=email.substring(email.indexOf('@')+1);
        String domain=email.substring('@'+1,email.indexOf("."));


        System.out.println("first name:"+firstName1+firstName);
        System.out.println("last name:"+lastname2+lastname);
        System.out.println("domain:"+domain);

*/
    }}









