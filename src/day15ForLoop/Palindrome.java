package day15ForLoop;

public class Palindrome {
    public static void main(String[] args) {


        String plndrome="leVel";

        String result="";

        for (int i = plndrome.length()-1; i >=0 ; i--) {
            result+=plndrome.charAt(i);//result increases once added any character to the result
            
        }
        System.out.println("result = " + result);
        boolean isPalindrome=plndrome.equalsIgnoreCase(result);//!!!!!!!!!!care the result;
        System.out.println("isPalindrome = " + isPalindrome);





        String palndrome2="yaray";
        String result1="";

        for (int l =palndrome2.length()-1; l >=0 ; l--) {
            result1+=palndrome2.charAt(l);
        }
        System.out.println("result1 = " + result1);
        boolean equal=palndrome2.equals(result1);
        System.out.println("equal = " + equal);


    }
}
