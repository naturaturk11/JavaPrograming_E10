package day23_CustomMethod;

public class FullNameOfNameOfPerson {
    public static void main(String[] args) {
String firstName="hEllo";
String lastName="sChOOl";
fullNameOfPerson(firstName,lastName);





    }
    //write a method that can print out the full name of a person in regular format
    //            ex:
    //               fullName("cYdEo", "SCHOOL");
    //
    //                output:
    //                    "Cydeo School"

public static void fullNameOfPerson(String firstName,String lastName){

       firstName= firstName.toLowerCase();
      String a1=""+firstName.charAt(0);
       a1= a1.toUpperCase();
      String a2=firstName.substring(1,firstName.length());
      String b=a1+a2;

      lastName=lastName.toLowerCase();
      String c=""+lastName.charAt(0);
      c=c.toUpperCase();
      String c1=lastName.substring(1,lastName.length());
      String d=c+c1;
    System.out.println(b+" "+d);
}




}
