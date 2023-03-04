package day8IfStatementsWithMuhtar;

public class P1 {
    public static void main(String[] args) {
        String residence= "Turkiye";
        String name= "Ahmet";
        int age= 20;
        boolean isFitForVote = age>=18 && residence=="Katar";


        if(isFitForVote){
            System.out.println(name+ " is available for vote.");}else{
            System.out.println(name+ " is no available for vote");}






    }





}
