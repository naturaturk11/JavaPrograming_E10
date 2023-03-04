package day9_IfStatements;

public class Practice2 {
    public static void main(String[] args) {

        int n2 = 55;
        //grade...A,B,C,D,F..

        boolean  A  =n2>=90;
        boolean  B  =n2>=80;
        boolean  C  =n2>=70;
        boolean  D  =n2>=60;
        boolean  F  =n2<59;

       if(A){System.out.println("Perfect");}
       else if (B) {
           System.out.println("Great");}
       else if (C) {
           System.out.println("Good");}
       else if (D) {
           System.out.println("Passed");}
       else{
           System.out.println("Failed");}

       }

    }







