package day19_loopReview;

public class UniqueCharacter1 {
    public static void main(String[] args) {


        String str="ASDFGHJHGFTRGFH";
        String result="";

        for (int l = 0; l <str.length() ; l++) {
            char ch=str.charAt(l);//this is method to convert any string in to the char
            int count=0;



            for (int i = 0; i <str.length() ; i++) {
                char each=str.charAt(i);//this is method to convert any string in to the char

                if(ch==each){
                    count++;
                }
            }if(count==1){
                result+=ch;
            }


        }System.out.println(result);






    }
}
