package day19_loopReview;

public class Freq1 {
    public static void main(String[] args) {

        /*Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1*/
        String str = "abccclllllld";
        String result="";

        for (int j = 0; j <str.length() ; j++) {
            char ch=str.charAt(j);
            int count=0;



            for (int i = 0; i <str.length() ; i++) {

                char each=str.charAt(i);
                if(ch==each){
                    count++;

        }

            }if(result.contains(""+ch)){
                continue;
            }
            result+=ch;
            result+=count;



        } System.out.println(result);







    }
}
