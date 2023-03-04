package day9_IfStatements;

public class Practice5 {


    public static void main(String[] args) {

        int a=20,b=30,c=40;

        boolean isAminimum=a<b && a<c;
        boolean isBminimum=b<c && b<a;
        boolean isCminumum=!isBminimum && isAminimum;

        if (isAminimum) {
            System.out.println(a+" is minumum number");} else if (isBminimum) {
            System.out.println(b+ " is minumum number ");}else {
            System.out.println(c+ " is a minimum number");}

        }


    }


