package day9_IfStatements;

public class MinNumber {


    public static void main(String[] args) {


/**
 1. Create a class called MinNumber, Write a program that can print
 the minimum number between two numbers, if both are equal then print Equal
 Ex:
 n1= 100, n2 = 200;
 output:
 100 is the minimum number
 n1 & n2
 possibility #1: n1 is Min
 possibility #2: n2 is Min
 possibility #3: equal
 */

int n1= 100;
int n2=200;

boolean n1isMin= n1<n2;
boolean n2isMin= n2<n1;
boolean equal= n1==n2;

if(n1isMin){
    System.out.println(n1+" is minumum number");}
if(n2isMin){
    System.out.println(n2+ "is minumum number ");}
    if(equal){
        System.out.println(equal);}

    }
}
