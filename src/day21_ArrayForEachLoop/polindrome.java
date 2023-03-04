package day21_ArrayForEachLoop;

public class polindrome {
    public static void main(String[] args) {

        /* write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
        */

      String[] words={"anna", "level", "Java"};

       int count=0;

        for (String each : words) {
            String reverse="";
            for (int i = each.length() - 1; i >= 0; i--) {//care for changing posion of each
                reverse+=each.charAt(i);

            }
            if(each.equalsIgnoreCase(reverse)){
                count++;
            }



        }
        System.out.println(count);




    }
}
