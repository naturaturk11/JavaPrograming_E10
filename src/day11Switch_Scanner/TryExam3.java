package day11Switch_Scanner;

public class TryExam3 {
    public static void main(String[] args) {


        char grade='B';
        String result="";

        switch (grade){
            case 'A':
                result= "excellent";
                break;
            case 'B':
                result= "great";
                break;
            case 'C':
                result="good";
                break;
            case 'D':
                result="passed";
                break;
            case 'F':
                result="failed";
            default:
                result="invalid points";


        }


        System.out.println("result = " + result);








    }




}
