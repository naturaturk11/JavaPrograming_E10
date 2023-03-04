package day14String2;

public class exm2 {
    public static void main(String[] args) {

        /** 3. Write a program that asks user to enter first and last names,
         and then prints the full name in regular format (first character in upper case)

         input:
         firstName = "cyDEo"
         lastName = "SCHOOL";

         output:
         Cydeo School*/

    ///////Cydeo
       String firstName = "cyDEo ";
        String lastName = "SCHOOL";
        firstName= firstName.substring(0, 1 ).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println(firstName);


        firstName= (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();

        System.out.println(firstName);

        lastName= lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
         String fullName=firstName + lastName;
        System.out.println(lastName);
        System.out.println(fullName);
        System.out.println("..........................................................................");

        String name1="celEBrate";//Celebrate Daarknes
        String name2="DAArkNes";

        name1=name1.substring(0,1).toUpperCase()+name1.substring(1).toLowerCase();
        name2=name2.substring(0,1).toUpperCase()+name2.substring(1).toLowerCase();
     String fullname=name1+" "+name2;
     System.out.println("name1 = " + name1);
     System.out.println("name2 = " + name2);
        System.out.println("fullname = " + fullname);


    }
}
