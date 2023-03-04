package day16ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {
String word="";
String r="LeveL";

 for(int i= r.length()-1;i>=0;i--){
     word+=r.charAt(i);

 }
        boolean isPalindrome= r.equalsIgnoreCase(word);//not forget to add equalsignorecase
        System.out.println("isPalindrome = " + isPalindrome);


        System.out.println("....................................................");
        
        
        String h="ala";
        String word1="";


        for (int l = h.length()-1; l >=0 ; l--) {
            word1+=h.charAt(l);
        }
            

            
            boolean isPalindromen=h.equalsIgnoreCase(word1);
            System.out.println("isPalindromen = " + isPalindromen);
            
        }






    }

