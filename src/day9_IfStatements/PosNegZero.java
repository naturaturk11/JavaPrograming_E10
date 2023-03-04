package day9_IfStatements;

public class PosNegZero {


    public static void main(String[] args) {


        int number= 20;
        boolean positive= number>0;
        boolean negative =number<0;

        if(positive) {
            System.out.println("positive");}else if(negative){
            System.out.println(" negative");}else{
            System.out.println("zero");}

    }
}
