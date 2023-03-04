package day24_ReturnMethod;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Level";
        isPalindrome(str);


    }
/*By using the reverse method above to create another method named isPalindrome
that passes a String parameter, the method returns true if the string is palindrome,
otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
  */

    public static String isPalindrome(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);



        }
        boolean isPalindrome = reverse.equalsIgnoreCase(str);
        System.out.println("isPalindrome = " + isPalindrome);
        return reverse;

    }
}












