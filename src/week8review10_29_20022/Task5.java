package week8review10_29_20022;

public class Task5 {
    public static void main(String[] args) {
        /*Task 4 :  For Each - Nested For

            Longest Palindrome

                Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
                    Ex:
                    Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
                    Output: No palindrome
        */

   String []input={"java", "longer word", "civic","apple", "racecar", "mom", "anna"};
   String longestPalindrome="";


        for (String eachWord : input) {

            boolean isPalindrrome=true;

            for(int i=0;i<eachWord.length()/2;i++){

                char ch1=eachWord.charAt(i);
                char ch2=eachWord.charAt(eachWord.length()-i-1);
           if(ch1!=ch2){
               isPalindrrome=false;
               break;
           }

            }if(isPalindrrome&&eachWord.length()>longestPalindrome.length()){
                longestPalindrome=eachWord;
            }

        }
        System.out.println(longestPalindrome);



    }
}
