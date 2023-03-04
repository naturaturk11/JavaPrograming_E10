package day17WhileDoWhile;

public class FrequencyOfWords {
    public static void main(String[] args) {

/*write a program that can return the frequency of the word java from the sentence

ex: sentence="JavaJavaJava";
output:3
Str = "JavaJava";

           		substrings:general concept of the how the substirng occurs
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)
 */

    String str="JavaJavaJavaJava";
    int frequency=0;

        for (int i = 0; i <=str.length()-4 ; i++) {
        String eachSub=    str.substring(i,i+4);
            
            if(eachSub.equals("Java")){
                frequency++;
            }

        }
        System.out.println("frequency = " + frequency);

        System.out.println(".................................................................");
















    }
}
