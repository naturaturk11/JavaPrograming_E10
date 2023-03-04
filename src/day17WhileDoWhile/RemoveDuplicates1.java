package day17WhileDoWhile;

public class RemoveDuplicates1 {
    public static void main(String[] args) {

        String str="ABBBCC";
        String result="";//"ABC"

        for (int i = 0; i < str.length(); i++) {
            String ch=""+str.charAt(i);//char is converted in to the String by adding "" or
                                      // if(result.contains(""+ch))


            if(result.contains(ch)){//if the result contains the character
                break;//skip
            }
            result+=ch;

        }
        System.out.println("result = " + result);




    }
}
