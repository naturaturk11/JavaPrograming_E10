package day13StringClass;


public class Task1 {
    public static void main(String[] args) {

        String a = "HELLoH";
        char a1 = a.charAt(2);
        char a2 = a.charAt(a.length() - 1);
        int b = a.length();
        char b2 = a.charAt(4);
        String s = a.toUpperCase();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("b2 = " + b2);
        System.out.println("b = " + b);
        System.out.println("s = " + s);

        System.out.println("....................................................");

        String s1 = "hallo world each of person is ok";
        String s2 = "what about you";
        int l = s1.length();
        int l1 = s2.length();
        if (l > l1) {
            System.out.println(l + " is the longest");
        } else {
            System.out.println(l + "is the longest");


            System.out.println(".....................................................");



            System.out.println(".....................................................");


        }


    }}
