package day40_FinalKeyWordAndProtectedMethod;

public class FinalVariable {

    final  String birthday;

    final static String name="Icran";


    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args) {

       final double pi=3.14;

        //pi=4.14;//final variable is unchangeable


        final String name;

        name="Java";
        //name="Wooden Spoon"; not be reassigned bcs its final variable
        System.out.println(name);


        System.out.println("....................................................");

        FinalVariable obj=new FinalVariable("MAY/02");

        System.out.println(obj.birthday);

        System.out.println(FinalVariable.name);
        //FinalVariable.name="Kare";   FİNAL VARİABLE DOES NOT LET TO MAKE CHANGE ON THE NAME













    }



}
