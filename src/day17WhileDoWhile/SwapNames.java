package day17WhileDoWhile;

public class SwapNames {

    public static void main(String[] args) {
        /*
3. Create a class called SwapNames.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.
        Write a program that can swap first name with last name in the email (Separated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: baris_manco@gmail.com
                output: manco_baris@gmail.com

*/

      String email="baris_manco@gmail.com";
      String result="";
      
     email= email.replace("baris_manco@gmail.com" ,"manco_baris@gmail.com");

         if(!email.contains("_")){
             System.out.println("baris_manco@gmail.com");}

        System.out.println("email = " + email);


    }







        }











