package day7OperatorsWithMuhtar;

public class LogicalOperators {


    public static void main(String[] args) {
   //both &&
   int age=19;
    String name="Steven";

   String citizen= "UK";
   boolean isElligible=age>=18 && citizen=="USA";//19>=18&&"uk" citizenship
         //each of conditions shoulbe matched otherwise the result always be false                                       //true &&false==>false
        //&& coulbe used more than two
        System.out.println(name+" is eliigible to vote: "+ isElligible);


        //....||  in logical or aoperator requirs just one of the variables are true
        String name3="Shay";
        int age3=21;
        char gender='f';

        boolean isElligible1= age3>=20&&(gender=='m'|| gender== 'f');
        System.out.println(name3+" is elligible for loan: "+isElligible1);

        System.out.println(".................................................");

        //!!!!!!!!!!!

        int score=85;
        boolean passed= score>=60;
        boolean failed=!passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);








    }
}
