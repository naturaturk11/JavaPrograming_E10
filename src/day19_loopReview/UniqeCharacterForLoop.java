package day19_loopReview;

public class UniqeCharacterForLoop {
    public static void main(String[] args) {

        /*Write a program that can find the unique characters from a string without using
        indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf*/

String   str = "aabccdeef";
String result=" ";//bdf

        for (int j = 0; j < str.length(); j++) {

            char ch=str.charAt(j);

            int count=0;//represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) {//compares the character that outer loop picked,with each character

                char each=str.charAt(i);
                if(ch==each){
                    count++;
                }



        }
          if(count==1){//if the ferquency of the character is one,then the character is unique
            result+=ch;//other optionel solution is if(count!=1) continue;

          }






        } System.out.println(result);







    }
}
