package day23_CustomMethod;

public class ElligibleToVote {


    public static void main(String[] args) {

        elligibleToVote(19,"USA");







    }

    public static void elligibleToVote(int age,String country){

        if(age>=18 && country=="USA"){
            System.out.println("Elligible to vote");
        }else {
            System.out.println("not elligible to vote");
        }



    }






}
