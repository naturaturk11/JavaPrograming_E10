package day11Switch_Scanner;

public class TryNewExam {
    public static void main(String[] args) {
        int n1=45;
        int n2=82;


        char operator = '(';

        boolean valid= operator== '+' ||operator=='-'|| operator== '*' || operator== '/';

        if(valid){

            switch (operator){
                case '+' :
                    System.out.println(n1+n2);
                    break;

                case '-':
                    System.out.println(n2-n1);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                default:
                    System.out.println(n2/n1);
            }


    }else {
            System.out.println("invalid values");


        }}}