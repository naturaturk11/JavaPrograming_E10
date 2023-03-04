package day23_CustomMethod;

public class CharacterOfChar {
    public static void main(String[] args) {


   String word="Hasan Sadebıyık";
  printEachChar(word);






    }
    // create a method named printEachChar that can print each characters of a string
    public static void printEachChar(String word){
        String result="";
        for (int i = 0; i <word.length() ; i++) {
            char ch=word.charAt(i);
            result+=ch;
            System.out.println(ch);
        }



    }




}
