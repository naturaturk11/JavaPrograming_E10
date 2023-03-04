package day8IfStatementsWithMuhtar;

public class ElligibleToVote {
    public static void main(String[] args) {
        String name= "Josh";

        int age= 20;
        String citizen= "USA";

        //elligible
        boolean isElligible= age>=21&&citizen=="USA";
        if(isElligible) {
            System.out.println(" Elligible");}




        //not elligible
            if( ! isElligible) {
                System.out.println("  not Elligible");}


    }





}
