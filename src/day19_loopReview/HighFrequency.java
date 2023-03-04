package day19_loopReview;

public class HighFrequency {
    public static void main(String[] args) {

        //Write a program that can find the character that has the highest frequency from a string

       String a="ADADADAKDKNJGFKaLA";
       a=a.toLowerCase();
       char ch=a.charAt(0);
       int count=0;


        for (int i = 0; i <a.length() ; i++) {

            char each=a.charAt(i);



            if(ch==each){
                count++;
            }

        }
        System.out.println(count);





    }
}
