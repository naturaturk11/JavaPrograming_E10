package day9_IfStatements;

public class Practice6 {

    public static void main(String[] args) {
         int number=6;
         String result="";

       result= (number<3)?" Live with than 3 people":(number>=3 && number<=6)? " Live with 3-6 people"
                : "more than 6 people";

        System.out.println(result);









    }
}
