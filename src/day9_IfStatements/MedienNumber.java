package day9_IfStatements;

public class MedienNumber {


    public static void main(String[] args) {


/**
 Create a class called MedianNumber. write a program that can find
 the median number between three DIFFERENT given integers
 Ex:
 a = 10, b= 15, c = 20;
 Output:
 15 is the median number
 Possibility #1: a could be median number
 Possibility #2: b could be median number
 Possibility #3: c could be median number
 */

int a=40;
int b=10;
int c=30;

boolean aIsMedian= (a<c && a>b ) || (a>c && a<b);
boolean bIsMedian= (b<c && b>a)|| (b>c && b<a);
boolean cIsMedian= !aIsMedian && !bIsMedian; // this expression is an alternative to classic ones as above


        if (aIsMedian){
            System.out.println(a+ "is the median number ");}
            if (bIsMedian){
                System.out.println(b+ " is the median number ");}
            if (cIsMedian){
                System.out.println(c +" is the median number");}




    }
}
