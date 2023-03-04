package day8IfStatementsWithMuhtar;

public class EligibleForCigarette {
    public static void main(String[] args) {

        int age=15;
        String placeOfBirth="USA";
        double money=123456;
        String document="pass";
        String result="";
        boolean isElligibleToFly=age>=14 && placeOfBirth=="UK" && money>=123456 && document=="pass";
        if(isElligibleToFly){
            result="It is available to fly alone";}

        else{result = "Not Accepted";}

        System.out.println("result = " + result);







    }}

