package day16ForLoopStringPractice;

public class RemovingTheDuplication1 {
    public static void main(String[] args) {


        String words="ABDYBDKKLLM";
        String result="";


        for(int i=0;i<=words.length()-1;i++){
             String ch=""+words.charAt(i);
             if(!result.contains(ch)){
                 result+=ch;
             }



        }
        System.out.println("result = " + result);



    }
}
