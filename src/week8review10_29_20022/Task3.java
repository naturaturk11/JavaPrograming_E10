package week8review10_29_20022;

public class Task3 {
    public static void main(String[] args) {


        /* Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter

                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

                Output : 4
         */

          String[] input ={"Anna","Mike","Aliya","Donald","Muhtar","Remus","Mehmet","Asya"};
          int countName=0;

        for (String s : input) {

           String first=s.charAt(0)+"";
           String last=s.charAt(s.length()-1)+"";
           if(first.equalsIgnoreCase(last)){
               countName++;


            }


        } System.out.println(countName);









    }

}
